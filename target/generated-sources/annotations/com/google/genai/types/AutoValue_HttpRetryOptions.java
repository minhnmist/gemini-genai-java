package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_HttpRetryOptions extends HttpRetryOptions {

  private final Optional<Integer> attempts;

  private final Optional<Double> initialDelay;

  private final Optional<Double> maxDelay;

  private final Optional<Double> expBase;

  private final Optional<Double> jitter;

  private final Optional<List<Integer>> httpStatusCodes;

  private AutoValue_HttpRetryOptions(
      Optional<Integer> attempts,
      Optional<Double> initialDelay,
      Optional<Double> maxDelay,
      Optional<Double> expBase,
      Optional<Double> jitter,
      Optional<List<Integer>> httpStatusCodes) {
    this.attempts = attempts;
    this.initialDelay = initialDelay;
    this.maxDelay = maxDelay;
    this.expBase = expBase;
    this.jitter = jitter;
    this.httpStatusCodes = httpStatusCodes;
  }

  @JsonProperty("attempts")
  @Override
  public Optional<Integer> attempts() {
    return attempts;
  }

  @JsonProperty("initialDelay")
  @Override
  public Optional<Double> initialDelay() {
    return initialDelay;
  }

  @JsonProperty("maxDelay")
  @Override
  public Optional<Double> maxDelay() {
    return maxDelay;
  }

  @JsonProperty("expBase")
  @Override
  public Optional<Double> expBase() {
    return expBase;
  }

  @JsonProperty("jitter")
  @Override
  public Optional<Double> jitter() {
    return jitter;
  }

  @JsonProperty("httpStatusCodes")
  @Override
  public Optional<List<Integer>> httpStatusCodes() {
    return httpStatusCodes;
  }

  @Override
  public String toString() {
    return "HttpRetryOptions{"
        + "attempts=" + attempts + ", "
        + "initialDelay=" + initialDelay + ", "
        + "maxDelay=" + maxDelay + ", "
        + "expBase=" + expBase + ", "
        + "jitter=" + jitter + ", "
        + "httpStatusCodes=" + httpStatusCodes
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof HttpRetryOptions) {
      HttpRetryOptions that = (HttpRetryOptions) o;
      return this.attempts.equals(that.attempts())
          && this.initialDelay.equals(that.initialDelay())
          && this.maxDelay.equals(that.maxDelay())
          && this.expBase.equals(that.expBase())
          && this.jitter.equals(that.jitter())
          && this.httpStatusCodes.equals(that.httpStatusCodes());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= attempts.hashCode();
    h$ *= 1000003;
    h$ ^= initialDelay.hashCode();
    h$ *= 1000003;
    h$ ^= maxDelay.hashCode();
    h$ *= 1000003;
    h$ ^= expBase.hashCode();
    h$ *= 1000003;
    h$ ^= jitter.hashCode();
    h$ *= 1000003;
    h$ ^= httpStatusCodes.hashCode();
    return h$;
  }

  @Override
  public HttpRetryOptions.Builder toBuilder() {
    return new AutoValue_HttpRetryOptions.Builder(this);
  }

  static final class Builder extends HttpRetryOptions.Builder {
    private Optional<Integer> attempts = Optional.empty();
    private Optional<Double> initialDelay = Optional.empty();
    private Optional<Double> maxDelay = Optional.empty();
    private Optional<Double> expBase = Optional.empty();
    private Optional<Double> jitter = Optional.empty();
    private Optional<List<Integer>> httpStatusCodes = Optional.empty();
    Builder() {
    }
    Builder(HttpRetryOptions source) {
      this.attempts = source.attempts();
      this.initialDelay = source.initialDelay();
      this.maxDelay = source.maxDelay();
      this.expBase = source.expBase();
      this.jitter = source.jitter();
      this.httpStatusCodes = source.httpStatusCodes();
    }
    @Override
    public HttpRetryOptions.Builder attempts(Integer attempts) {
      this.attempts = Optional.of(attempts);
      return this;
    }
    @Override
    HttpRetryOptions.Builder attempts(Optional<Integer> attempts) {
      if (attempts == null) {
        throw new NullPointerException("Null attempts");
      }
      this.attempts = attempts;
      return this;
    }
    @Override
    public HttpRetryOptions.Builder initialDelay(Double initialDelay) {
      this.initialDelay = Optional.of(initialDelay);
      return this;
    }
    @Override
    HttpRetryOptions.Builder initialDelay(Optional<Double> initialDelay) {
      if (initialDelay == null) {
        throw new NullPointerException("Null initialDelay");
      }
      this.initialDelay = initialDelay;
      return this;
    }
    @Override
    public HttpRetryOptions.Builder maxDelay(Double maxDelay) {
      this.maxDelay = Optional.of(maxDelay);
      return this;
    }
    @Override
    HttpRetryOptions.Builder maxDelay(Optional<Double> maxDelay) {
      if (maxDelay == null) {
        throw new NullPointerException("Null maxDelay");
      }
      this.maxDelay = maxDelay;
      return this;
    }
    @Override
    public HttpRetryOptions.Builder expBase(Double expBase) {
      this.expBase = Optional.of(expBase);
      return this;
    }
    @Override
    HttpRetryOptions.Builder expBase(Optional<Double> expBase) {
      if (expBase == null) {
        throw new NullPointerException("Null expBase");
      }
      this.expBase = expBase;
      return this;
    }
    @Override
    public HttpRetryOptions.Builder jitter(Double jitter) {
      this.jitter = Optional.of(jitter);
      return this;
    }
    @Override
    HttpRetryOptions.Builder jitter(Optional<Double> jitter) {
      if (jitter == null) {
        throw new NullPointerException("Null jitter");
      }
      this.jitter = jitter;
      return this;
    }
    @Override
    public HttpRetryOptions.Builder httpStatusCodes(List<Integer> httpStatusCodes) {
      this.httpStatusCodes = Optional.of(httpStatusCodes);
      return this;
    }
    @Override
    HttpRetryOptions.Builder httpStatusCodes(Optional<List<Integer>> httpStatusCodes) {
      if (httpStatusCodes == null) {
        throw new NullPointerException("Null httpStatusCodes");
      }
      this.httpStatusCodes = httpStatusCodes;
      return this;
    }
    @Override
    public HttpRetryOptions build() {
      return new AutoValue_HttpRetryOptions(
          this.attempts,
          this.initialDelay,
          this.maxDelay,
          this.expBase,
          this.jitter,
          this.httpStatusCodes);
    }
  }

}
