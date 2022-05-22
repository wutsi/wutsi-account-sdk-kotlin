package com.wutsi.platform.account.dto

import kotlin.Boolean
import kotlin.Long
import kotlin.String

public data class CreateAccountRequest(
  public val phoneNumber: String = "",
  public val language: String = "en",
  public val country: String = "US",
  public val displayName: String? = null,
  public val pictureUrl: String? = null,
  public val password: String? = null,
  public val addPaymentMethod: Boolean = false,
  public val business: Boolean = false,
  public val cityId: Long? = null
)
