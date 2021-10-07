package com.wutsi.platform.account.dto

import kotlin.String

public data class CreateAccountRequest(
  public val phoneNumber: String = "",
  public val language: String = "en",
  public val country: String = "US",
  public val displayName: String? = null,
  public val pictureUrl: String? = null
)
