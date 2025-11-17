package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Endpoint extends Endpoint {

  private final Optional<String> name;

  private final Optional<String> deployedModelId;

  private AutoValue_Endpoint(
      Optional<String> name,
      Optional<String> deployedModelId) {
    this.name = name;
    this.deployedModelId = deployedModelId;
  }

  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return name;
  }

  @JsonProperty("deployedModelId")
  @Override
  public Optional<String> deployedModelId() {
    return deployedModelId;
  }

  @Override
  public String toString() {
    return "Endpoint{"
        + "name=" + name + ", "
        + "deployedModelId=" + deployedModelId
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Endpoint) {
      Endpoint that = (Endpoint) o;
      return this.name.equals(that.name())
          && this.deployedModelId.equals(that.deployedModelId());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= deployedModelId.hashCode();
    return h$;
  }

  @Override
  public Endpoint.Builder toBuilder() {
    return new AutoValue_Endpoint.Builder(this);
  }

  static final class Builder extends Endpoint.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<String> deployedModelId = Optional.empty();
    Builder() {
    }
    Builder(Endpoint source) {
      this.name = source.name();
      this.deployedModelId = source.deployedModelId();
    }
    @Override
    public Endpoint.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    Endpoint.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public Endpoint.Builder deployedModelId(String deployedModelId) {
      this.deployedModelId = Optional.of(deployedModelId);
      return this;
    }
    @Override
    Endpoint.Builder deployedModelId(Optional<String> deployedModelId) {
      if (deployedModelId == null) {
        throw new NullPointerException("Null deployedModelId");
      }
      this.deployedModelId = deployedModelId;
      return this;
    }
    @Override
    public Endpoint build() {
      return new AutoValue_Endpoint(
          this.name,
          this.deployedModelId);
    }
  }

}
