package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_DeleteResourceJob extends DeleteResourceJob {

  private final Optional<HttpResponse> sdkHttpResponse;

  private final Optional<String> name;

  private final Optional<Boolean> done;

  private final Optional<JobError> error;

  private AutoValue_DeleteResourceJob(
      Optional<HttpResponse> sdkHttpResponse,
      Optional<String> name,
      Optional<Boolean> done,
      Optional<JobError> error) {
    this.sdkHttpResponse = sdkHttpResponse;
    this.name = name;
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

  @JsonProperty("done")
  @Override
  public Optional<Boolean> done() {
    return done;
  }

  @JsonProperty("error")
  @Override
  public Optional<JobError> error() {
    return error;
  }

  @Override
  public String toString() {
    return "DeleteResourceJob{"
        + "sdkHttpResponse=" + sdkHttpResponse + ", "
        + "name=" + name + ", "
        + "done=" + done + ", "
        + "error=" + error
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DeleteResourceJob) {
      DeleteResourceJob that = (DeleteResourceJob) o;
      return this.sdkHttpResponse.equals(that.sdkHttpResponse())
          && this.name.equals(that.name())
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
    h$ ^= done.hashCode();
    h$ *= 1000003;
    h$ ^= error.hashCode();
    return h$;
  }

  @Override
  public DeleteResourceJob.Builder toBuilder() {
    return new AutoValue_DeleteResourceJob.Builder(this);
  }

  static final class Builder extends DeleteResourceJob.Builder {
    private Optional<HttpResponse> sdkHttpResponse = Optional.empty();
    private Optional<String> name = Optional.empty();
    private Optional<Boolean> done = Optional.empty();
    private Optional<JobError> error = Optional.empty();
    Builder() {
    }
    Builder(DeleteResourceJob source) {
      this.sdkHttpResponse = source.sdkHttpResponse();
      this.name = source.name();
      this.done = source.done();
      this.error = source.error();
    }
    @Override
    public DeleteResourceJob.Builder sdkHttpResponse(HttpResponse sdkHttpResponse) {
      this.sdkHttpResponse = Optional.of(sdkHttpResponse);
      return this;
    }
    @Override
    DeleteResourceJob.Builder sdkHttpResponse(Optional<HttpResponse> sdkHttpResponse) {
      if (sdkHttpResponse == null) {
        throw new NullPointerException("Null sdkHttpResponse");
      }
      this.sdkHttpResponse = sdkHttpResponse;
      return this;
    }
    @Override
    public DeleteResourceJob.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    DeleteResourceJob.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public DeleteResourceJob.Builder done(boolean done) {
      this.done = Optional.of(done);
      return this;
    }
    @Override
    DeleteResourceJob.Builder done(Optional<Boolean> done) {
      if (done == null) {
        throw new NullPointerException("Null done");
      }
      this.done = done;
      return this;
    }
    @Override
    public DeleteResourceJob.Builder error(JobError error) {
      this.error = Optional.of(error);
      return this;
    }
    @Override
    DeleteResourceJob.Builder error(Optional<JobError> error) {
      if (error == null) {
        throw new NullPointerException("Null error");
      }
      this.error = error;
      return this;
    }
    @Override
    public DeleteResourceJob build() {
      return new AutoValue_DeleteResourceJob(
          this.sdkHttpResponse,
          this.name,
          this.done,
          this.error);
    }
  }

}
