package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_RetrievalConfig extends RetrievalConfig {

  private final Optional<LatLng> latLng;

  private final Optional<String> languageCode;

  private AutoValue_RetrievalConfig(
      Optional<LatLng> latLng,
      Optional<String> languageCode) {
    this.latLng = latLng;
    this.languageCode = languageCode;
  }

  @JsonProperty("latLng")
  @Override
  public Optional<LatLng> latLng() {
    return latLng;
  }

  @JsonProperty("languageCode")
  @Override
  public Optional<String> languageCode() {
    return languageCode;
  }

  @Override
  public String toString() {
    return "RetrievalConfig{"
        + "latLng=" + latLng + ", "
        + "languageCode=" + languageCode
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RetrievalConfig) {
      RetrievalConfig that = (RetrievalConfig) o;
      return this.latLng.equals(that.latLng())
          && this.languageCode.equals(that.languageCode());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= latLng.hashCode();
    h$ *= 1000003;
    h$ ^= languageCode.hashCode();
    return h$;
  }

  @Override
  public RetrievalConfig.Builder toBuilder() {
    return new AutoValue_RetrievalConfig.Builder(this);
  }

  static final class Builder extends RetrievalConfig.Builder {
    private Optional<LatLng> latLng = Optional.empty();
    private Optional<String> languageCode = Optional.empty();
    Builder() {
    }
    Builder(RetrievalConfig source) {
      this.latLng = source.latLng();
      this.languageCode = source.languageCode();
    }
    @Override
    public RetrievalConfig.Builder latLng(LatLng latLng) {
      this.latLng = Optional.of(latLng);
      return this;
    }
    @Override
    RetrievalConfig.Builder latLng(Optional<LatLng> latLng) {
      if (latLng == null) {
        throw new NullPointerException("Null latLng");
      }
      this.latLng = latLng;
      return this;
    }
    @Override
    public RetrievalConfig.Builder languageCode(String languageCode) {
      this.languageCode = Optional.of(languageCode);
      return this;
    }
    @Override
    RetrievalConfig.Builder languageCode(Optional<String> languageCode) {
      if (languageCode == null) {
        throw new NullPointerException("Null languageCode");
      }
      this.languageCode = languageCode;
      return this;
    }
    @Override
    public RetrievalConfig build() {
      return new AutoValue_RetrievalConfig(
          this.latLng,
          this.languageCode);
    }
  }

}
