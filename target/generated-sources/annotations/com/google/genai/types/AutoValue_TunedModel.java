package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_TunedModel extends TunedModel {

  private final Optional<String> model;

  private final Optional<String> endpoint;

  private final Optional<List<TunedModelCheckpoint>> checkpoints;

  private AutoValue_TunedModel(
      Optional<String> model,
      Optional<String> endpoint,
      Optional<List<TunedModelCheckpoint>> checkpoints) {
    this.model = model;
    this.endpoint = endpoint;
    this.checkpoints = checkpoints;
  }

  @JsonProperty("model")
  @Override
  public Optional<String> model() {
    return model;
  }

  @JsonProperty("endpoint")
  @Override
  public Optional<String> endpoint() {
    return endpoint;
  }

  @JsonProperty("checkpoints")
  @Override
  public Optional<List<TunedModelCheckpoint>> checkpoints() {
    return checkpoints;
  }

  @Override
  public String toString() {
    return "TunedModel{"
        + "model=" + model + ", "
        + "endpoint=" + endpoint + ", "
        + "checkpoints=" + checkpoints
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TunedModel) {
      TunedModel that = (TunedModel) o;
      return this.model.equals(that.model())
          && this.endpoint.equals(that.endpoint())
          && this.checkpoints.equals(that.checkpoints());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= model.hashCode();
    h$ *= 1000003;
    h$ ^= endpoint.hashCode();
    h$ *= 1000003;
    h$ ^= checkpoints.hashCode();
    return h$;
  }

  @Override
  public TunedModel.Builder toBuilder() {
    return new AutoValue_TunedModel.Builder(this);
  }

  static final class Builder extends TunedModel.Builder {
    private Optional<String> model = Optional.empty();
    private Optional<String> endpoint = Optional.empty();
    private Optional<List<TunedModelCheckpoint>> checkpoints = Optional.empty();
    Builder() {
    }
    Builder(TunedModel source) {
      this.model = source.model();
      this.endpoint = source.endpoint();
      this.checkpoints = source.checkpoints();
    }
    @Override
    public TunedModel.Builder model(String model) {
      this.model = Optional.of(model);
      return this;
    }
    @Override
    TunedModel.Builder model(Optional<String> model) {
      if (model == null) {
        throw new NullPointerException("Null model");
      }
      this.model = model;
      return this;
    }
    @Override
    public TunedModel.Builder endpoint(String endpoint) {
      this.endpoint = Optional.of(endpoint);
      return this;
    }
    @Override
    TunedModel.Builder endpoint(Optional<String> endpoint) {
      if (endpoint == null) {
        throw new NullPointerException("Null endpoint");
      }
      this.endpoint = endpoint;
      return this;
    }
    @Override
    public TunedModel.Builder checkpoints(List<TunedModelCheckpoint> checkpoints) {
      this.checkpoints = Optional.of(checkpoints);
      return this;
    }
    @Override
    TunedModel.Builder checkpoints(Optional<List<TunedModelCheckpoint>> checkpoints) {
      if (checkpoints == null) {
        throw new NullPointerException("Null checkpoints");
      }
      this.checkpoints = checkpoints;
      return this;
    }
    @Override
    public TunedModel build() {
      return new AutoValue_TunedModel(
          this.model,
          this.endpoint,
          this.checkpoints);
    }
  }

}
