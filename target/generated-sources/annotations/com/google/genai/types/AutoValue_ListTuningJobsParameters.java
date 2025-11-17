package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ListTuningJobsParameters extends ListTuningJobsParameters {

  private final Optional<ListTuningJobsConfig> config;

  private AutoValue_ListTuningJobsParameters(
      Optional<ListTuningJobsConfig> config) {
    this.config = config;
  }

  @JsonProperty("config")
  @Override
  public Optional<ListTuningJobsConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "ListTuningJobsParameters{"
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ListTuningJobsParameters) {
      ListTuningJobsParameters that = (ListTuningJobsParameters) o;
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
  public ListTuningJobsParameters.Builder toBuilder() {
    return new AutoValue_ListTuningJobsParameters.Builder(this);
  }

  static final class Builder extends ListTuningJobsParameters.Builder {
    private Optional<ListTuningJobsConfig> config = Optional.empty();
    Builder() {
    }
    Builder(ListTuningJobsParameters source) {
      this.config = source.config();
    }
    @Override
    public ListTuningJobsParameters.Builder config(ListTuningJobsConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    ListTuningJobsParameters.Builder config(Optional<ListTuningJobsConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public ListTuningJobsParameters build() {
      return new AutoValue_ListTuningJobsParameters(
          this.config);
    }
  }

}
