package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_FunctionResponse extends FunctionResponse {

  private final Optional<Boolean> willContinue;

  private final Optional<FunctionResponseScheduling> scheduling;

  private final Optional<List<FunctionResponsePart>> parts;

  private final Optional<String> id;

  private final Optional<String> name;

  private final Optional<Map<String, Object>> response;

  private AutoValue_FunctionResponse(
      Optional<Boolean> willContinue,
      Optional<FunctionResponseScheduling> scheduling,
      Optional<List<FunctionResponsePart>> parts,
      Optional<String> id,
      Optional<String> name,
      Optional<Map<String, Object>> response) {
    this.willContinue = willContinue;
    this.scheduling = scheduling;
    this.parts = parts;
    this.id = id;
    this.name = name;
    this.response = response;
  }

  @JsonProperty("willContinue")
  @Override
  public Optional<Boolean> willContinue() {
    return willContinue;
  }

  @JsonProperty("scheduling")
  @Override
  public Optional<FunctionResponseScheduling> scheduling() {
    return scheduling;
  }

  @JsonProperty("parts")
  @Override
  public Optional<List<FunctionResponsePart>> parts() {
    return parts;
  }

  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return id;
  }

  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return name;
  }

  @JsonProperty("response")
  @Override
  public Optional<Map<String, Object>> response() {
    return response;
  }

  @Override
  public String toString() {
    return "FunctionResponse{"
        + "willContinue=" + willContinue + ", "
        + "scheduling=" + scheduling + ", "
        + "parts=" + parts + ", "
        + "id=" + id + ", "
        + "name=" + name + ", "
        + "response=" + response
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FunctionResponse) {
      FunctionResponse that = (FunctionResponse) o;
      return this.willContinue.equals(that.willContinue())
          && this.scheduling.equals(that.scheduling())
          && this.parts.equals(that.parts())
          && this.id.equals(that.id())
          && this.name.equals(that.name())
          && this.response.equals(that.response());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= willContinue.hashCode();
    h$ *= 1000003;
    h$ ^= scheduling.hashCode();
    h$ *= 1000003;
    h$ ^= parts.hashCode();
    h$ *= 1000003;
    h$ ^= id.hashCode();
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= response.hashCode();
    return h$;
  }

  @Override
  public FunctionResponse.Builder toBuilder() {
    return new AutoValue_FunctionResponse.Builder(this);
  }

  static final class Builder extends FunctionResponse.Builder {
    private Optional<Boolean> willContinue = Optional.empty();
    private Optional<FunctionResponseScheduling> scheduling = Optional.empty();
    private Optional<List<FunctionResponsePart>> parts = Optional.empty();
    private Optional<String> id = Optional.empty();
    private Optional<String> name = Optional.empty();
    private Optional<Map<String, Object>> response = Optional.empty();
    Builder() {
    }
    Builder(FunctionResponse source) {
      this.willContinue = source.willContinue();
      this.scheduling = source.scheduling();
      this.parts = source.parts();
      this.id = source.id();
      this.name = source.name();
      this.response = source.response();
    }
    @Override
    public FunctionResponse.Builder willContinue(boolean willContinue) {
      this.willContinue = Optional.of(willContinue);
      return this;
    }
    @Override
    FunctionResponse.Builder willContinue(Optional<Boolean> willContinue) {
      if (willContinue == null) {
        throw new NullPointerException("Null willContinue");
      }
      this.willContinue = willContinue;
      return this;
    }
    @Override
    public FunctionResponse.Builder scheduling(FunctionResponseScheduling scheduling) {
      this.scheduling = Optional.of(scheduling);
      return this;
    }
    @Override
    FunctionResponse.Builder scheduling(Optional<FunctionResponseScheduling> scheduling) {
      if (scheduling == null) {
        throw new NullPointerException("Null scheduling");
      }
      this.scheduling = scheduling;
      return this;
    }
    @Override
    public FunctionResponse.Builder parts(List<FunctionResponsePart> parts) {
      this.parts = Optional.of(parts);
      return this;
    }
    @Override
    FunctionResponse.Builder parts(Optional<List<FunctionResponsePart>> parts) {
      if (parts == null) {
        throw new NullPointerException("Null parts");
      }
      this.parts = parts;
      return this;
    }
    @Override
    public FunctionResponse.Builder id(String id) {
      this.id = Optional.of(id);
      return this;
    }
    @Override
    FunctionResponse.Builder id(Optional<String> id) {
      if (id == null) {
        throw new NullPointerException("Null id");
      }
      this.id = id;
      return this;
    }
    @Override
    public FunctionResponse.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    FunctionResponse.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public FunctionResponse.Builder response(Map<String, Object> response) {
      this.response = Optional.of(response);
      return this;
    }
    @Override
    FunctionResponse.Builder response(Optional<Map<String, Object>> response) {
      if (response == null) {
        throw new NullPointerException("Null response");
      }
      this.response = response;
      return this;
    }
    @Override
    public FunctionResponse build() {
      return new AutoValue_FunctionResponse(
          this.willContinue,
          this.scheduling,
          this.parts,
          this.id,
          this.name,
          this.response);
    }
  }

}
