package com.wutsi.platform.account

import com.wutsi.platform.account.dto.AddPaymentMethodRequest
import com.wutsi.platform.account.dto.AddPaymentMethodResponse
import com.wutsi.platform.account.dto.CreateAccountRequest
import com.wutsi.platform.account.dto.CreateAccountResponse
import com.wutsi.platform.account.dto.GetAccountResponse
import com.wutsi.platform.account.dto.GetPaymentMethodResponse
import com.wutsi.platform.account.dto.ListPaymentMethodResponse
import com.wutsi.platform.account.dto.SavePasswordRequest
import com.wutsi.platform.account.dto.SearchAccountResponse
import com.wutsi.platform.account.dto.UpdateAccountAttributeRequest
import com.wutsi.platform.account.dto.UpdatePaymentMethodRequest
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit

public interface WutsiAccountApi {
  @RequestLine("GET /v1/accounts?phone-number={phone-number}&limit={limit}&offset={offset}")
  @Headers("Content-Type: application/json")
  public fun searchAccount(
    @Param("phone-number") phoneNumber: String,
    @Param("limit") limit: Int = 20,
    @Param("offset") offset: Int = 0
  ): SearchAccountResponse

  @RequestLine("POST /v1/accounts")
  @Headers("Content-Type: application/json")
  public fun createAccount(request: CreateAccountRequest): CreateAccountResponse

  @RequestLine("GET /v1/accounts/{id}")
  @Headers("Content-Type: application/json")
  public fun getAccount(@Param("id") id: Long): GetAccountResponse

  @RequestLine("DELETE /v1/accounts/{id}")
  @Headers("Content-Type: application/json")
  public fun deleteAccount(@Param("id") id: Long): Unit

  @RequestLine("POST /v1/accounts/{id}/attributes/{name}")
  @Headers("Content-Type: application/json")
  public fun updateAccountAttribute(
    @Param("id") id: Long,
    @Param("name") name: String,
    request: UpdateAccountAttributeRequest
  ): Unit

  @RequestLine("GET /v1/accounts/{id}/password?password={password}")
  @Headers("Content-Type: application/json")
  public fun checkPassword(@Param("id") id: Long, @Param("password") password: String): Unit

  @RequestLine("POST /v1/accounts/{id}/password")
  @Headers("Content-Type: application/json")
  public fun savePassword(@Param("id") id: Long, request: SavePasswordRequest): Unit

  @RequestLine("GET /v1/accounts/{id}/payment-methods")
  @Headers("Content-Type: application/json")
  public fun listPaymentMethods(@Param("id") id: Long): ListPaymentMethodResponse

  @RequestLine("POST /v1/accounts/{id}/payment-methods")
  @Headers("Content-Type: application/json")
  public fun addPaymentMethod(@Param("id") id: Long, request: AddPaymentMethodRequest):
      AddPaymentMethodResponse

  @RequestLine("GET /v1/accounts/{id}/payment-methods/{token}")
  @Headers("Content-Type: application/json")
  public fun getPaymentMethod(@Param("id") id: Long, @Param("token") token: String):
      GetPaymentMethodResponse

  @RequestLine("POST /v1/accounts/{id}/payment-methods/{token}")
  @Headers("Content-Type: application/json")
  public fun updatePaymentMethod(
    @Param("id") id: Long,
    @Param("token") token: String,
    request: UpdatePaymentMethodRequest
  ): Unit

  @RequestLine("DELETE /v1/accounts/{id}/payment-methods/{token}")
  @Headers("Content-Type: application/json")
  public fun deletePaymentMethod(@Param("id") id: Long, @Param("token") token: String): Unit
}
