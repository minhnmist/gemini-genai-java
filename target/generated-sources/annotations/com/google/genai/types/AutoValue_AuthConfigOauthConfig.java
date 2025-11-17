package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_AuthConfigOauthConfig extends AuthConfigOauthConfig {

  private final Optional<String> accessToken;

  private final Optional<String> serviceAccount;

  private AutoValue_AuthConfigOauthConfig(
      Optional<String> accessToken,
      Optional<String> serviceAccount) {
    this.accessToken = accessToken;
    this.serviceAccount = serviceAccount;
  }

  @JsonProperty("accessToken")
  @Override
  public Optional<String> accessToken() {
    return accessToken;
  }

  @JsonProperty("serviceAccount")
  @Override
  public Optional<String> serviceAccount() {
    return serviceAccount;
  }

  @Override
  public String toString() {
    return "AuthConfigOauthConfig{"
        + "accessToken=" + accessToken + ", "
        + "serviceAccount=" + serviceAccount
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AuthConfigOauthConfig) {
      AuthConfigOauthConfig that = (AuthConfigOauthConfig) o;
      return this.accessToken.equals(that.accessToken())
          && this.serviceAccount.equals(that.serviceAccount());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= accessToken.hashCode();
    h$ *= 1000003;
    h$ ^= serviceAccount.hashCode();
    return h$;
  }

  @Override
  public AuthConfigOauthConfig.Builder toBuilder() {
    return new AutoValue_AuthConfigOauthConfig.Builder(this);
  }

  static final class Builder extends AuthConfigOauthConfig.Builder {
    private Optional<String> accessToken = Optional.empty();
    private Optional<String> serviceAccount = Optional.empty();
    Builder() {
    }
    Builder(AuthConfigOauthConfig source) {
      this.accessToken = source.accessToken();
      this.serviceAccount = source.serviceAccount();
    }
    @Override
    public AuthConfigOauthConfig.Builder accessToken(String accessToken) {
      this.accessToken = Optional.of(accessToken);
      return this;
    }
    @Override
    AuthConfigOauthConfig.Builder accessToken(Optional<String> accessToken) {
      if (accessToken == null) {
        throw new NullPointerException("Null accessToken");
      }
      this.accessToken = accessToken;
      return this;
    }
    @Override
    public AuthConfigOauthConfig.Builder serviceAccount(String serviceAccount) {
      this.serviceAccount = Optional.of(serviceAccount);
      return this;
    }
    @Override
    AuthConfigOauthConfig.Builder serviceAccount(Optional<String> serviceAccount) {
      if (serviceAccount == null) {
        throw new NullPointerException("Null serviceAccount");
      }
      this.serviceAccount = serviceAccount;
      return this;
    }
    @Override
    public AuthConfigOauthConfig build() {
      return new AutoValue_AuthConfigOauthConfig(
          this.accessToken,
          this.serviceAccount);
    }
  }

}
