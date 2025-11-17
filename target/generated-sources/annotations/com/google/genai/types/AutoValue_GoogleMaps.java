package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GoogleMaps extends GoogleMaps {

  private final Optional<AuthConfig> authConfig;

  private final Optional<Boolean> enableWidget;

  private AutoValue_GoogleMaps(
      Optional<AuthConfig> authConfig,
      Optional<Boolean> enableWidget) {
    this.authConfig = authConfig;
    this.enableWidget = enableWidget;
  }

  @JsonProperty("authConfig")
  @Override
  public Optional<AuthConfig> authConfig() {
    return authConfig;
  }

  @JsonProperty("enableWidget")
  @Override
  public Optional<Boolean> enableWidget() {
    return enableWidget;
  }

  @Override
  public String toString() {
    return "GoogleMaps{"
        + "authConfig=" + authConfig + ", "
        + "enableWidget=" + enableWidget
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GoogleMaps) {
      GoogleMaps that = (GoogleMaps) o;
      return this.authConfig.equals(that.authConfig())
          && this.enableWidget.equals(that.enableWidget());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= authConfig.hashCode();
    h$ *= 1000003;
    h$ ^= enableWidget.hashCode();
    return h$;
  }

  @Override
  public GoogleMaps.Builder toBuilder() {
    return new AutoValue_GoogleMaps.Builder(this);
  }

  static final class Builder extends GoogleMaps.Builder {
    private Optional<AuthConfig> authConfig = Optional.empty();
    private Optional<Boolean> enableWidget = Optional.empty();
    Builder() {
    }
    Builder(GoogleMaps source) {
      this.authConfig = source.authConfig();
      this.enableWidget = source.enableWidget();
    }
    @Override
    public GoogleMaps.Builder authConfig(AuthConfig authConfig) {
      this.authConfig = Optional.of(authConfig);
      return this;
    }
    @Override
    GoogleMaps.Builder authConfig(Optional<AuthConfig> authConfig) {
      if (authConfig == null) {
        throw new NullPointerException("Null authConfig");
      }
      this.authConfig = authConfig;
      return this;
    }
    @Override
    public GoogleMaps.Builder enableWidget(boolean enableWidget) {
      this.enableWidget = Optional.of(enableWidget);
      return this;
    }
    @Override
    GoogleMaps.Builder enableWidget(Optional<Boolean> enableWidget) {
      if (enableWidget == null) {
        throw new NullPointerException("Null enableWidget");
      }
      this.enableWidget = enableWidget;
      return this;
    }
    @Override
    public GoogleMaps build() {
      return new AutoValue_GoogleMaps(
          this.authConfig,
          this.enableWidget);
    }
  }

}
