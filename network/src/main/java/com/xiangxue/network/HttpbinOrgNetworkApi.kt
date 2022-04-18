package com.xiangxue.network

import com.xiangxue.network.base.BaseNetworkApi
import okhttp3.Interceptor

object HttpbinOrgNetworkApi : BaseNetworkApi("https://httpbin.org/") {

    override fun getInterceptor(): Interceptor? {
        return null
    }
}