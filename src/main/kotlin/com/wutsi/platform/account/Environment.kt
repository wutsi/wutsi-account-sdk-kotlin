package com.wutsi.platform.account

import kotlin.String

public enum class Environment(
  public val url: String
) {
  SANDBOX("https://wutsi-account-server-test.herokuapp.com"),
  PRODUCTION("https://wutsi-account-server-prod.herokuapp.com"),
  ;
}
