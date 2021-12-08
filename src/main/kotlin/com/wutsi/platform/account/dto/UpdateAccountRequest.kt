package com.wutsi.platform.account.dto

import kotlin.String

public data class UpdateAccountRequest(
  public val language: String = "en",
  public val country: String = "US",
  public val displayName: String? = null
)
