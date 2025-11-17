package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_TuningOperation extends TuningOperation {

  private final Optional<HttpResponse> sdkHttpResponse;

  private final Optional<String> name;

  private final Optional<Map<String, Object>> metadata;

  private final Optional<Boolean> done;

  private final Optional<Map<String, Object>> error;

  private AutoValue_TuningOperation(
      Optional<HttpResponse> sdkHttpResponse,
      Optional<String> name,
      Optional<Map<String, Object>> metadata,
      Optional<Boolean> done,
      Optional<Map<String, Object>> error) {
    this.sdkHttpResponse = sdkHttpResponse;
    this.name = name;
    this.metadata = metadata;
    this.done = done;
    this.error = error;
  }

  @JsonProperty("sdkHttpResponse")
  @Override
  public Optional<HttpResponse> sdkHttpResponse() {
    return sdkHttpResponse;
  }

  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return name;
  }

  @JsonProperty("metadata")
  @Override
  public Optional<Map<String, Object>> metadata() {
    return metadata;
  }

  @JsonProperty("done")
  @Override
  public Optional<Boolean> done() {
    return done;
  }

  @JsonProperty("error")
  @Override
  public Optional<Map<String, Object>> error() {
    return error;
  }

  @Override
  public String toString() {
    return "TuningOperation{"
        + "sdkHttpResponse=" + sdkHttpResponse + ", "
        + "name=" + name + ", "
        + "metadata=" + metadata + ", "
        + "done=" + done + ", "
        + "error=" + error
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TuningOperation) {
      TuningOperation that = (TuningOperation) o;
      return this.sdkHttpResponse.equals(that.sdkHttpResponse())
          && this.name.equals(that.name())
          && this.metadata.equals(that.metadata())
          && this.done.equals(that.done())
          && this.error.equals(that.error());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= sdkHttpResponse.hashCode();
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= metadata.hashCode();
    h$ *= 1000003;
    h$ ^= done.hashCode();
    h$ *= 1000003;
    h$ ^= error.hashCode();
    return h$;
  }

  @Override
  public TuningOperation.Builder toBuilder() {
    return new AutoValue_TuningOperation.Builder(this);
  }

  static final class Builder extends TuningOperation.Builder {
    private Optional<HttpResponse> sdkHttpResponse = Optional.empty();
    private Optional<String> name = Optional.empty();
    private Optional<Map<String, Object>> metadata = Optional.empty();
    private Optional<Boolean> done = Optional.empty();
    private Optional<Map<String, Object>> error = Optional.empty();
    Builder() {
    }
    Builder(TuningOperation source) {
      this.sdkHttpResponse = source.sdkHttpResponse();
      this.name = source.name();
      this.metadata = source.metadata();
      this.done = source.done();
      this.error = source.error();
    }
    @Override
    public TuningOperation.Builder sdkHttpResponse(HttpResponse sdkHttpResponse) {
      this.sdkHttpResponse = Optional.of(sdkHttpResponse);
      return this;
    }
    @Override
    TuningOperation.Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse) {
      if (sdkHttpResponse == null) {
        throw new NullPointerException("Null sdkHttpResponse");
      }
      this.sdkHttpResponse = sdkHttpResponse;
      return this;
    }
    @Override
    public TuningOperation.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    TuningOperation.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public TuningOperation.Builder metadata(Map<String, Object> metadata) {
      this.metadata = Optional.of(metadata);
      return this;
    }
    @Override
    TuningOperation.Builder metadata(Optional<Map<String, Object>> metadata) {
      if (metadata == null) {
        throw new NullPointerException("Null metadata");
      }
      this.metadata = metadata;
      return this;
    }
    @Override
    public TuningOperation.Builder done(boolean done) {
      this.done = Optional.of(done);
      return this;
    }
    @Override
    TuningOperation.Builder done(Optional<Boolean> done) {
      if (done == null) {
        throw new NullPointerException("Null done");
      }
      this.done = done;
      return this;
    }
    @Override
    public TuningOperation.Builder error(Map<String, Object> error) {
      this.error = Optional.of(error);
      return this;
    }
    @Override
    TuningOperation.Builder error(Optional<Map<String, Object>> error) {
      if (error == null) {
        throw new NullPointerException("Null error");
      }
      this.error = error;
      return this;
    }
    @Override
    public TuningOperation build() {
      return new AutoValue_TuningOperation(
          this.sdkHttpResponse,
          this.name,
          this.metadata,
          this.done,
          this.error);
    }
  }

}
