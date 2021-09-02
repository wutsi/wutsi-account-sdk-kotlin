package com.wutsi.platform.account.dto

import kotlin.String

public data class UpdatePaymentMethodRequest(
  public val ownerName: String = "",
  public val provider: String = ""
)
