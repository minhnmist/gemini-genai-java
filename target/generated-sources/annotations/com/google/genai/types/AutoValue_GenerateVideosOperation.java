package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GenerateVideosOperation extends GenerateVideosOperation {

  private final Optional<String> name;

  private final Optional<Map<String, Object>> metadata;

  private final Optional<Boolean> done;

  private final Optional<Map<String, Object>> error;

  private final Optional<GenerateVideosResponse> response;

  private AutoValue_GenerateVideosOperation(
      Optional<String> name,
      Optional<Map<String, Object>> metadata,
      Optional<Boolean> done,
      Optional<Map<String, Object>> error,
      Optional<GenerateVideosResponse> response) {
    this.name = name;
    this.metadata = metadata;
    this.done = done;
    this.error = error;
    this.response = response;
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

  @JsonProperty("response")
  @Override
  public Optional<GenerateVideosResponse> response() {
    return response;
  }

  @Override
  public String toString() {
    return "GenerateVideosOperation{"
        + "name=" + name + ", "
        + "metadata=" + metadata + ", "
        + "done=" + done + ", "
        + "error=" + error + ", "
        + "response=" + response
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GenerateVideosOperation) {
      GenerateVideosOperation that = (GenerateVideosOperation) o;
      return this.name.equals(that.name())
          && this.metadata.equals(that.metadata())
          && this.done.equals(that.done())
          && this.error.equals(that.error())
          && this.response.equals(that.response());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= metadata.hashCode();
    h$ *= 1000003;
    h$ ^= done.hashCode();
    h$ *= 1000003;
    h$ ^= error.hashCode();
    h$ *= 1000003;
    h$ ^= response.hashCode();
    return h$;
  }

  @Override
  public GenerateVideosOperation.Builder toBuilder() {
    return new AutoValue_GenerateVideosOperation.Builder(this);
  }

  static final class Builder extends GenerateVideosOperation.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<Map<String, Object>> metadata = Optional.empty();
    private Optional<Boolean> done = Optional.empty();
    private Optional<Map<String, Object>> error = Optional.empty();
    private Optional<GenerateVideosResponse> response = Optional.empty();
    Builder() {
    }
    Builder(GenerateVideosOperation source) {
      this.name = source.name();
      this.metadata = source.metadata();
      this.done = source.done();
      this.error = source.error();
      this.response = source.response();
    }
    @Override
    public GenerateVideosOperation.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    GenerateVideosOperation.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public GenerateVideosOperation.Builder metadata(Map<String, Object> metadata) {
      this.metadata = Optional.of(metadata);
      return this;
    }
    @Override
    GenerateVideosOperation.Builder metadata(Optional<Map<String, Object>> metadata) {
      if (metadata == null) {
        throw new NullPointerException("Null metadata");
      }
      this.metadata = metadata;
      return this;
    }
    @Override
    public GenerateVideosOperation.Builder done(boolean done) {
      this.done = Optional.of(done);
      return this;
    }
    @Override
    GenerateVideosOperation.Builder done(Optional<Boolean> done) {
      if (done == null) {
        throw new NullPointerException("Null done");
      }
      this.done = done;
      return this;
    }
    @Override
    public GenerateVideosOperation.Builder error(Map<String, Object> error) {
      this.error = Optional.of(error);
      return this;
    }
    @Override
    GenerateVideosOperation.Builder error(Optional<Map<String, Object>> error) {
      if (error == null) {
        throw new NullPointerException("Null error");
      }
      this.error = error;
      return this;
    }
    @Override
    public GenerateVideosOperation.Builder response(GenerateVideosResponse response) {
      this.response = Optional.of(response);
      return this;
    }
    @Override
    GenerateVideosOperation.Builder response(Optional<GenerateVideosResponse> response) {
      if (response == null) {
        throw new NullPointerException("Null response");
      }
      this.response = response;
      return this;
    }
    @Override
    public GenerateVideosOperation build() {
      return new AutoValue_GenerateVideosOperation(
          this.name,
          this.metadata,
          this.done,
          this.error,
          this.response);
    }
  }

}
