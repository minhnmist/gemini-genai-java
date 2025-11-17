package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_PreTunedModel extends PreTunedModel {

  private final Optional<String> baseModel;

  private final Optional<String> checkpointId;

  private final Optional<String> tunedModelName;

  private AutoValue_PreTunedModel(
      Optional<String> baseModel,
      Optional<String> checkpointId,
      Optional<String> tunedModelName) {
    this.baseModel = baseModel;
    this.checkpointId = checkpointId;
    this.tunedModelName = tunedModelName;
  }

  @JsonProperty("baseModel")
  @Override
  public Optional<String> baseModel() {
    return baseModel;
  }

  @JsonProperty("checkpointId")
  @Override
  public Optional<String> checkpointId() {
    return checkpointId;
  }

  @JsonProperty("tunedModelName")
  @Override
  public Optional<String> tunedModelName() {
    return tunedModelName;
  }

  @Override
  public String toString() {
    return "PreTunedModel{"
        + "baseModel=" + baseModel + ", "
        + "checkpointId=" + checkpointId + ", "
        + "tunedModelName=" + tunedModelName
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PreTunedModel) {
      PreTunedModel that = (PreTunedModel) o;
      return this.baseModel.equals(that.baseModel())
          && this.checkpointId.equals(that.checkpointId())
          && this.tunedModelName.equals(that.tunedModelName());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= baseModel.hashCode();
    h$ *= 1000003;
    h$ ^= checkpointId.hashCode();
    h$ *= 1000003;
    h$ ^= tunedModelName.hashCode();
    return h$;
  }

  @Override
  public PreTunedModel.Builder toBuilder() {
    return new AutoValue_PreTunedModel.Builder(this);
  }

  static final class Builder extends PreTunedModel.Builder {
    private Optional<String> baseModel = Optional.empty();
    private Optional<String> checkpointId = Optional.empty();
    private Optional<String> tunedModelName = Optional.empty();
    Builder() {
    }
    Builder(PreTunedModel source) {
      this.baseModel = source.baseModel();
      this.checkpointId = source.checkpointId();
      this.tunedModelName = source.tunedModelName();
    }
    @Override
    public PreTunedModel.Builder baseModel(String baseModel) {
      this.baseModel = Optional.of(baseModel);
      return this;
    }
    @Override
    PreTunedModel.Builder baseModel(Optional<String> baseModel) {
      if (baseModel == null) {
        throw new NullPointerException("Null baseModel");
      }
      this.baseModel = baseModel;
      return this;
    }
    @Override
    public PreTunedModel.Builder checkpointId(String checkpointId) {
      this.checkpointId = Optional.of(checkpointId);
      return this;
    }
    @Override
    PreTunedModel.Builder checkpointId(Optional<String> checkpointId) {
      if (checkpointId == null) {
        throw new NullPointerException("Null checkpointId");
      }
      this.checkpointId = checkpointId;
      return this;
    }
    @Override
    public PreTunedModel.Builder tunedModelName(String tunedModelName) {
      this.tunedModelName = Optional.of(tunedModelName);
      return this;
    }
    @Override
    PreTunedModel.Builder tunedModelName(Optional<String> tunedModelName) {
      if (tunedModelName == null) {
        throw new NullPointerException("Null tunedModelName");
      }
      this.tunedModelName = tunedModelName;
      return this;
    }
    @Override
    public PreTunedModel build() {
      return new AutoValue_PreTunedModel(
          this.baseModel,
          this.checkpointId,
          this.tunedModelName);
    }
  }

}
