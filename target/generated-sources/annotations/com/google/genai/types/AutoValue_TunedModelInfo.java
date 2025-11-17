package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_TunedModelInfo extends TunedModelInfo {

  private final Optional<String> baseModel;

  private final Optional<Instant> createTime;

  private final Optional<Instant> updateTime;

  private AutoValue_TunedModelInfo(
      Optional<String> baseModel,
      Optional<Instant> createTime,
      Optional<Instant> updateTime) {
    this.baseModel = baseModel;
    this.createTime = createTime;
    this.updateTime = updateTime;
  }

  @JsonProperty("baseModel")
  @Override
  public Optional<String> baseModel() {
    return baseModel;
  }

  @JsonProperty("createTime")
  @Override
  public Optional<Instant> createTime() {
    return createTime;
  }

  @JsonProperty("updateTime")
  @Override
  public Optional<Instant> updateTime() {
    return updateTime;
  }

  @Override
  public String toString() {
    return "TunedModelInfo{"
        + "baseModel=" + baseModel + ", "
        + "createTime=" + createTime + ", "
        + "updateTime=" + updateTime
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TunedModelInfo) {
      TunedModelInfo that = (TunedModelInfo) o;
      return this.baseModel.equals(that.baseModel())
          && this.createTime.equals(that.createTime())
          && this.updateTime.equals(that.updateTime());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= baseModel.hashCode();
    h$ *= 1000003;
    h$ ^= createTime.hashCode();
    h$ *= 1000003;
    h$ ^= updateTime.hashCode();
    return h$;
  }

  @Override
  public TunedModelInfo.Builder toBuilder() {
    return new AutoValue_TunedModelInfo.Builder(this);
  }

  static final class Builder extends TunedModelInfo.Builder {
    private Optional<String> baseModel = Optional.empty();
    private Optional<Instant> createTime = Optional.empty();
    private Optional<Instant> updateTime = Optional.empty();
    Builder() {
    }
    Builder(TunedModelInfo source) {
      this.baseModel = source.baseModel();
      this.createTime = source.createTime();
      this.updateTime = source.updateTime();
    }
    @Override
    public TunedModelInfo.Builder baseModel(String baseModel) {
      this.baseModel = Optional.of(baseModel);
      return this;
    }
    @Override
    TunedModelInfo.Builder baseModel(Optional<String> baseModel) {
      if (baseModel == null) {
        throw new NullPointerException("Null baseModel");
      }
      this.baseModel = baseModel;
      return this;
    }
    @Override
    public TunedModelInfo.Builder createTime(Instant createTime) {
      this.createTime = Optional.of(createTime);
      return this;
    }
    @Override
    TunedModelInfo.Builder createTime(Optional<Instant> createTime) {
      if (createTime == null) {
        throw new NullPointerException("Null createTime");
      }
      this.createTime = createTime;
      return this;
    }
    @Override
    public TunedModelInfo.Builder updateTime(Instant updateTime) {
      this.updateTime = Optional.of(updateTime);
      return this;
    }
    @Override
    TunedModelInfo.Builder updateTime(Optional<Instant> updateTime) {
      if (updateTime == null) {
        throw new NullPointerException("Null updateTime");
      }
      this.updateTime = updateTime;
      return this;
    }
    @Override
    public TunedModelInfo build() {
      return new AutoValue_TunedModelInfo(
          this.baseModel,
          this.createTime,
          this.updateTime);
    }
  }

}
