package com.wutsi.platform.account.dto

import kotlin.String

public data class AddPaymentMethodRequest(
  public val ownerName: String = "",
  public val phoneNumber: String? = null,
  public val type: String = "",
  public val provider: String = ""
)
