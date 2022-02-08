package com.wutsi.platform.account.dto

import java.time.OffsetDateTime
import kotlin.String

public data class PaymentMethodSummary(
  public val token: String = "",
  public val type: String = "",
  public val provider: String = "",
  public val ownerName: String = "",
  public val maskedNumber: String = "",
  public val phone: Phone = Phone(),
  public val created: OffsetDateTime = OffsetDateTime.now(),
  public val updated: OffsetDateTime = OffsetDateTime.now()
)
