package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CreateBatchJobParameters extends CreateBatchJobParameters {

  private final Optional<String> model;

  private final Optional<BatchJobSource> src;

  private final Optional<CreateBatchJobConfig> config;

  private AutoValue_CreateBatchJobParameters(
      Optional<String> model,
      Optional<BatchJobSource> src,
      Optional<CreateBatchJobConfig> config) {
    this.model = model;
    this.src = src;
    this.config = config;
  }

  @JsonProperty("model")
  @Override
  public Optional<String> model() {
    return model;
  }

  @JsonProperty("src")
  @Override
  public Optional<BatchJobSource> src() {
    return src;
  }

  @JsonProperty("config")
  @Override
  public Optional<CreateBatchJobConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "CreateBatchJobParameters{"
        + "model=" + model + ", "
        + "src=" + src + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateBatchJobParameters) {
      CreateBatchJobParameters that = (CreateBatchJobParameters) o;
      return this.model.equals(that.model())
          && this.src.equals(that.src())
          && this.config.equals(that.config());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= model.hashCode();
    h$ *= 1000003;
    h$ ^= src.hashCode();
    h$ *= 1000003;
    h$ ^= config.hashCode();
    return h$;
  }

  @Override
  public CreateBatchJobParameters.Builder toBuilder() {
    return new AutoValue_CreateBatchJobParameters.Builder(this);
  }

  static final class Builder extends CreateBatchJobParameters.Builder {
    private Optional<String> model = Optional.empty();
    private Optional<BatchJobSource> src = Optional.empty();
    private Optional<CreateBatchJobConfig> config = Optional.empty();
    Builder() {
    }
    Builder(CreateBatchJobParameters source) {
      this.model = source.model();
      this.src = source.src();
      this.config = source.config();
    }
    @Override
    public CreateBatchJobParameters.Builder model(String model) {
      this.model = Optional.of(model);
      return this;
    }
    @Override
    CreateBatchJobParameters.Builder model(Optional<String> model) {
      if (model == null) {
        throw new NullPointerException("Null model");
      }
      this.model = model;
      return this;
    }
    @Override
    public CreateBatchJobParameters.Builder src(BatchJobSource src) {
      this.src = Optional.of(src);
      return this;
    }
    @Override
    CreateBatchJobParameters.Builder src(Optional<BatchJobSource> src) {
      if (src == null) {
        throw new NullPointerException("Null src");
      }
      this.src = src;
      return this;
    }
    @Override
    public CreateBatchJobParameters.Builder config(CreateBatchJobConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    CreateBatchJobParameters.Builder config(Optional<CreateBatchJobConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public CreateBatchJobParameters build() {
      return new AutoValue_CreateBatchJobParameters(
          this.model,
          this.src,
          this.config);
    }
  }

}
