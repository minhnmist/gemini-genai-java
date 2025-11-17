package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_AuthConfigOidcConfig extends AuthConfigOidcConfig {

  private final Optional<String> idToken;

  private final Optional<String> serviceAccount;

  private AutoValue_AuthConfigOidcConfig(
      Optional<String> idToken,
      Optional<String> serviceAccount) {
    this.idToken = idToken;
    this.serviceAccount = serviceAccount;
  }

  @JsonProperty("idToken")
  @Override
  public Optional<String> idToken() {
    return idToken;
  }

  @JsonProperty("serviceAccount")
  @Override
  public Optional<String> serviceAccount() {
    return serviceAccount;
  }

  @Override
  public String toString() {
    return "AuthConfigOidcConfig{"
        + "idToken=" + idToken + ", "
        + "serviceAccount=" + serviceAccount
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AuthConfigOidcConfig) {
      AuthConfigOidcConfig that = (AuthConfigOidcConfig) o;
      return this.idToken.equals(that.idToken())
          && this.serviceAccount.equals(that.serviceAccount());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= idToken.hashCode();
    h$ *= 1000003;
    h$ ^= serviceAccount.hashCode();
    return h$;
  }

  @Override
  public AuthConfigOidcConfig.Builder toBuilder() {
    return new AutoValue_AuthConfigOidcConfig.Builder(this);
  }

  static final class Builder extends AuthConfigOidcConfig.Builder {
    private Optional<String> idToken = Optional.empty();
    private Optional<String> serviceAccount = Optional.empty();
    Builder() {
    }
    Builder(AuthConfigOidcConfig source) {
      this.idToken = source.idToken();
      this.serviceAccount = source.serviceAccount();
    }
    @Override
    public AuthConfigOidcConfig.Builder idToken(String idToken) {
      this.idToken = Optional.of(idToken);
      return this;
    }
    @Override
    AuthConfigOidcConfig.Builder idToken(Optional<String> idToken) {
      if (idToken == null) {
        throw new NullPointerException("Null idToken");
      }
      this.idToken = idToken;
      return this;
    }
    @Override
    public AuthConfigOidcConfig.Builder serviceAccount(String serviceAccount) {
      this.serviceAccount = Optional.of(serviceAccount);
      return this;
    }
    @Override
    AuthConfigOidcConfig.Builder serviceAccount(Optional<String> serviceAccount) {
      if (serviceAccount == null) {
        throw new NullPointerException("Null serviceAccount");
      }
      this.serviceAccount = serviceAccount;
      return this;
    }
    @Override
    public AuthConfigOidcConfig build() {
      return new AutoValue_AuthConfigOidcConfig(
          this.idToken,
          this.serviceAccount);
    }
  }

}
