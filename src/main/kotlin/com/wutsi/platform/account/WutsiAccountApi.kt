package com.wutsi.platform.account

import com.wutsi.platform.account.dto.AddPaymentMethodRequest
import com.wutsi.platform.account.dto.AddPaymentMethodResponse
import com.wutsi.platform.account.dto.CreateAccountRequest
import com.wutsi.platform.account.dto.CreateAccountResponse
import com.wutsi.platform.account.dto.EnableBusinessRequest
import com.wutsi.platform.account.dto.GetAccountResponse
import com.wutsi.platform.account.dto.GetCategoryResponse
import com.wutsi.platform.account.dto.GetPaymentMethodResponse
import com.wutsi.platform.account.dto.ListBusinessHourResponse
import com.wutsi.platform.account.dto.ListCategoryResponse
import com.wutsi.platform.account.dto.ListPaymentMethodResponse
import com.wutsi.platform.account.dto.SaveBusinessHourRequest
import com.wutsi.platform.account.dto.SavePasswordRequest
import com.wutsi.platform.account.dto.SearchAccountRequest
import com.wutsi.platform.account.dto.SearchAccountResponse
import com.wutsi.platform.account.dto.UpdateAccountAttributeRequest
import com.wutsi.platform.account.dto.UpdateAccountRequest
import com.wutsi.platform.account.dto.UpdateAccountResponse
import com.wutsi.platform.account.dto.UpdatePaymentMethodRequest
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.Long
import kotlin.String
import kotlin.Unit

public interface WutsiAccountApi {
  @RequestLine("POST /v1/accounts")
  @Headers(value=["Content-Type: application/json"])
  public fun createAccount(request: CreateAccountRequest): CreateAccountResponse

  @RequestLine("POST /v1/accounts/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchAccount(request: SearchAccountRequest): SearchAccountResponse

  @RequestLine("GET /v1/accounts/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getAccount(@Param("id") id: Long): GetAccountResponse

  @RequestLine("POST /v1/accounts/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun updateAccount(@Param("id") id: Long, request: UpdateAccountRequest):
      UpdateAccountResponse

  @RequestLine("DELETE /v1/accounts/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun deleteAccount(@Param("id") id: Long): Unit

  @RequestLine("POST /v1/accounts/{id}/attributes/{name}")
  @Headers(value=["Content-Type: application/json"])
  public fun updateAccountAttribute(
    @Param("id") id: Long,
    @Param("name") name: String,
    request: UpdateAccountAttributeRequest
  ): Unit

  @RequestLine("GET /v1/accounts/{id}/password?password={password}")
  @Headers(value=["Content-Type: application/json"])
  public fun checkPassword(@Param("id") id: Long, @Param("password") password: String): Unit

  @RequestLine("POST /v1/accounts/{id}/password")
  @Headers(value=["Content-Type: application/json"])
  public fun savePassword(@Param("id") id: Long, request: SavePasswordRequest): Unit

  @RequestLine("POST /v1/accounts/{id}/business")
  @Headers(value=["Content-Type: application/json"])
  public fun enableBusiness(@Param("id") id: Long, request: EnableBusinessRequest): Unit

  @RequestLine("DELETE /v1/accounts/{id}/business")
  @Headers(value=["Content-Type: application/json"])
  public fun disableBusiness(@Param("id") id: Long): Unit

  @RequestLine("GET /v1/accounts/{id}/business-hours")
  @Headers(value=["Content-Type: application/json"])
  public fun listBusinessHours(@Param("id") id: Long): ListBusinessHourResponse

  @RequestLine("POST /v1/accounts/{id}/business-hours")
  @Headers(value=["Content-Type: application/json"])
  public fun saveBusinessHour(@Param("id") id: Long, request: SaveBusinessHourRequest): Unit

  @RequestLine("GET /v1/categories")
  @Headers(value=["Content-Type: application/json"])
  public fun listCategories(): ListCategoryResponse

  @RequestLine("GET /v1/categories/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getCategory(@Param("id") id: Long): GetCategoryResponse

  @RequestLine("GET /v1/accounts/{id}/payment-methods")
  @Headers(value=["Content-Type: application/json"])
  public fun listPaymentMethods(@Param("id") id: Long): ListPaymentMethodResponse

  @RequestLine("POST /v1/accounts/{id}/payment-methods")
  @Headers(value=["Content-Type: application/json"])
  public fun addPaymentMethod(@Param("id") id: Long, request: AddPaymentMethodRequest):
      AddPaymentMethodResponse

  @RequestLine("GET /v1/accounts/{id}/payment-methods/{token}")
  @Headers(value=["Content-Type: application/json"])
  public fun getPaymentMethod(@Param("id") id: Long, @Param("token") token: String):
      GetPaymentMethodResponse

  @RequestLine("POST /v1/accounts/{id}/payment-methods/{token}")
  @Headers(value=["Content-Type: application/json"])
  public fun updatePaymentMethod(
    @Param("id") id: Long,
    @Param("token") token: String,
    request: UpdatePaymentMethodRequest
  ): Unit

  @RequestLine("DELETE /v1/accounts/{id}/payment-methods/{token}")
  @Headers(value=["Content-Type: application/json"])
  public fun deletePaymentMethod(@Param("id") id: Long, @Param("token") token: String): Unit
}
