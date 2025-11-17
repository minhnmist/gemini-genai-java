package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_AuthConfigHttpBasicAuthConfig extends AuthConfigHttpBasicAuthConfig {

  private final Optional<String> credentialSecret;

  private AutoValue_AuthConfigHttpBasicAuthConfig(
      Optional<String> credentialSecret) {
    this.credentialSecret = credentialSecret;
  }

  @JsonProperty("credentialSecret")
  @Override
  public Optional<String> credentialSecret() {
    return credentialSecret;
  }

  @Override
  public String toString() {
    return "AuthConfigHttpBasicAuthConfig{"
        + "credentialSecret=" + credentialSecret
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AuthConfigHttpBasicAuthConfig) {
      AuthConfigHttpBasicAuthConfig that = (AuthConfigHttpBasicAuthConfig) o;
      return this.credentialSecret.equals(that.credentialSecret());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= credentialSecret.hashCode();
    return h$;
  }

  @Override
  public AuthConfigHttpBasicAuthConfig.Builder toBuilder() {
    return new AutoValue_AuthConfigHttpBasicAuthConfig.Builder(this);
  }

  static final class Builder extends AuthConfigHttpBasicAuthConfig.Builder {
    private Optional<String> credentialSecret = Optional.empty();
    Builder() {
    }
    Builder(AuthConfigHttpBasicAuthConfig source) {
      this.credentialSecret = source.credentialSecret();
    }
    @Override
    public AuthConfigHttpBasicAuthConfig.Builder credentialSecret(String credentialSecret) {
      this.credentialSecret = Optional.of(credentialSecret);
      return this;
    }
    @Override
    AuthConfigHttpBasicAuthConfig.Builder credentialSecret(Optional<String> credentialSecret) {
      if (credentialSecret == null) {
        throw new NullPointerException("Null credentialSecret");
      }
      this.credentialSecret = credentialSecret;
      return this;
    }
    @Override
    public AuthConfigHttpBasicAuthConfig build() {
      return new AutoValue_AuthConfigHttpBasicAuthConfig(
          this.credentialSecret);
    }
  }

}
