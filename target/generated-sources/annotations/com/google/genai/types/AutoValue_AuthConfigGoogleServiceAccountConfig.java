package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_AuthConfigGoogleServiceAccountConfig extends AuthConfigGoogleServiceAccountConfig {

  private final Optional<String> serviceAccount;

  private AutoValue_AuthConfigGoogleServiceAccountConfig(
      Optional<String> serviceAccount) {
    this.serviceAccount = serviceAccount;
  }

  @JsonProperty("serviceAccount")
  @Override
  public Optional<String> serviceAccount() {
    return serviceAccount;
  }

  @Override
  public String toString() {
    return "AuthConfigGoogleServiceAccountConfig{"
        + "serviceAccount=" + serviceAccount
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AuthConfigGoogleServiceAccountConfig) {
      AuthConfigGoogleServiceAccountConfig that = (AuthConfigGoogleServiceAccountConfig) o;
      return this.serviceAccount.equals(that.serviceAccount());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= serviceAccount.hashCode();
    return h$;
  }

  @Override
  public AuthConfigGoogleServiceAccountConfig.Builder toBuilder() {
    return new AutoValue_AuthConfigGoogleServiceAccountConfig.Builder(this);
  }

  static final class Builder extends AuthConfigGoogleServiceAccountConfig.Builder {
    private Optional<String> serviceAccount = Optional.empty();
    Builder() {
    }
    Builder(AuthConfigGoogleServiceAccountConfig source) {
      this.serviceAccount = source.serviceAccount();
    }
    @Override
    public AuthConfigGoogleServiceAccountConfig.Builder serviceAccount(String serviceAccount) {
      this.serviceAccount = Optional.of(serviceAccount);
      return this;
    }
    @Override
    AuthConfigGoogleServiceAccountConfig.Builder serviceAccount(Optional<String> serviceAccount) {
      if (serviceAccount == null) {
        throw new NullPointerException("Null serviceAccount");
      }
      this.serviceAccount = serviceAccount;
      return this;
    }
    @Override
    public AuthConfigGoogleServiceAccountConfig build() {
      return new AutoValue_AuthConfigGoogleServiceAccountConfig(
          this.serviceAccount);
    }
  }

}
