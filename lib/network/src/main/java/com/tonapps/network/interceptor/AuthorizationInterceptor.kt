package com.tonapps.network.interceptor

import android.util.Log
import okhttp3.Interceptor
import okhttp3.Response

class AuthorizationInterceptor(
    private val type: Type = Type.NONE,
    private val token: String,
): Interceptor {

    companion object {
        fun bearer(token: String) = AuthorizationInterceptor(Type.BEARER, token)
    }

    enum class Type {
        NONE,
        BASIC,
        BEARER
    }

    private val headerValue: String by lazy {
        when(type) {
            Type.BEARER -> "Bearer $token"
            Type.BASIC -> "Basic $token"
            else -> token
        }
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()

        val request = original.newBuilder()
            .header("Authorization", headerValue)
            .method(original.method, original.body)
            .build()

        return chain.proceed(request)
    }
}