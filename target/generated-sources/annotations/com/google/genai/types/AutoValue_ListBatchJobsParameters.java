package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ListBatchJobsParameters extends ListBatchJobsParameters {

  private final Optional<ListBatchJobsConfig> config;

  private AutoValue_ListBatchJobsParameters(
      Optional<ListBatchJobsConfig> config) {
    this.config = config;
  }

  @JsonProperty("config")
  @Override
  public Optional<ListBatchJobsConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "ListBatchJobsParameters{"
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ListBatchJobsParameters) {
      ListBatchJobsParameters that = (ListBatchJobsParameters) o;
      return this.config.equals(that.config());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= config.hashCode();
    return h$;
  }

  @Override
  public ListBatchJobsParameters.Builder toBuilder() {
    return new AutoValue_ListBatchJobsParameters.Builder(this);
  }

  static final class Builder extends ListBatchJobsParameters.Builder {
    private Optional<ListBatchJobsConfig> config = Optional.empty();
    Builder() {
    }
    Builder(ListBatchJobsParameters source) {
      this.config = source.config();
    }
    @Override
    public ListBatchJobsParameters.Builder config(ListBatchJobsConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    ListBatchJobsParameters.Builder config(Optional<ListBatchJobsConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public ListBatchJobsParameters build() {
      return new AutoValue_ListBatchJobsParameters(
          this.config);
    }
  }

}
