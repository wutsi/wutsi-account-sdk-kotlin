package com.wutsi.platform.account

import com.fasterxml.jackson.databind.ObjectMapper
import feign.RequestInterceptor
import kotlin.collections.List

public class WutsiAccountApiBuilder {
  public fun build(
    env: Environment,
    mapper: ObjectMapper,
    interceptors: List<RequestInterceptor> = emptyList()
  ) = feign.Feign.builder()
    .client(feign.okhttp.OkHttpClient())
    .encoder(feign.jackson.JacksonEncoder(mapper))
    .decoder(feign.jackson.JacksonDecoder(mapper))
    .logger(feign.slf4j.Slf4jLogger(WutsiAccountApi::class.java))
    .logLevel(feign.Logger.Level.BASIC)
    .requestInterceptors(interceptors)
    .target(WutsiAccountApi::class.java, env.url)
}
