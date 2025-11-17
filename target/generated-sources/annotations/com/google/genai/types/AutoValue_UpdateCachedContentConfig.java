package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_UpdateCachedContentConfig extends UpdateCachedContentConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<Duration> ttl;

  private final Optional<Instant> expireTime;

  private AutoValue_UpdateCachedContentConfig(
      Optional<HttpOptions> httpOptions,
      Optional<Duration> ttl,
      Optional<Instant> expireTime) {
    this.httpOptions = httpOptions;
    this.ttl = ttl;
    this.expireTime = expireTime;
  }

  @JsonProperty("httpOptions")
  @Override
  public Optional<HttpOptions> httpOptions() {
    return httpOptions;
  }

  @JsonProperty("ttl")
  @Override
  public Optional<Duration> ttl() {
    return ttl;
  }

  @JsonProperty("expireTime")
  @Override
  public Optional<Instant> expireTime() {
    return expireTime;
  }

  @Override
  public String toString() {
    return "UpdateCachedContentConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "ttl=" + ttl + ", "
        + "expireTime=" + expireTime
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UpdateCachedContentConfig) {
      UpdateCachedContentConfig that = (UpdateCachedContentConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.ttl.equals(that.ttl())
          && this.expireTime.equals(that.expireTime());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= httpOptions.hashCode();
    h$ *= 1000003;
    h$ ^= ttl.hashCode();
    h$ *= 1000003;
    h$ ^= expireTime.hashCode();
    return h$;
  }

  @Override
  public UpdateCachedContentConfig.Builder toBuilder() {
    return new AutoValue_UpdateCachedContentConfig.Builder(this);
  }

  static final class Builder extends UpdateCachedContentConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<Duration> ttl = Optional.empty();
    private Optional<Instant> expireTime = Optional.empty();
    Builder() {
    }
    Builder(UpdateCachedContentConfig source) {
      this.httpOptions = source.httpOptions();
      this.ttl = source.ttl();
      this.expireTime = source.expireTime();
    }
    @Override
    public UpdateCachedContentConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    UpdateCachedContentConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public UpdateCachedContentConfig.Builder ttl(Duration ttl) {
      this.ttl = Optional.of(ttl);
      return this;
    }
    @Override
    UpdateCachedContentConfig.Builder ttl(Optional<Duration> ttl) {
      if (ttl == null) {
        throw new NullPointerException("Null ttl");
      }
      this.ttl = ttl;
      return this;
    }
    @Override
    public UpdateCachedContentConfig.Builder expireTime(Instant expireTime) {
      this.expireTime = Optional.of(expireTime);
      return this;
    }
    @Override
    UpdateCachedContentConfig.Builder expireTime(Optional<Instant> expireTime) {
      if (expireTime == null) {
        throw new NullPointerException("Null expireTime");
      }
      this.expireTime = expireTime;
      return this;
    }
    @Override
    public UpdateCachedContentConfig build() {
      return new AutoValue_UpdateCachedContentConfig(
          this.httpOptions,
          this.ttl,
          this.expireTime);
    }
  }

}
