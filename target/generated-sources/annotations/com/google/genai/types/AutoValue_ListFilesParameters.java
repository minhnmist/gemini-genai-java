package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ListFilesParameters extends ListFilesParameters {

  private final Optional<ListFilesConfig> config;

  private AutoValue_ListFilesParameters(
      Optional<ListFilesConfig> config) {
    this.config = config;
  }

  @JsonProperty("config")
  @Override
  public Optional<ListFilesConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "ListFilesParameters{"
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ListFilesParameters) {
      ListFilesParameters that = (ListFilesParameters) o;
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
  public ListFilesParameters.Builder toBuilder() {
    return new AutoValue_ListFilesParameters.Builder(this);
  }

  static final class Builder extends ListFilesParameters.Builder {
    private Optional<ListFilesConfig> config = Optional.empty();
    Builder() {
    }
    Builder(ListFilesParameters source) {
      this.config = source.config();
    }
    @Override
    public ListFilesParameters.Builder config(ListFilesConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    ListFilesParameters.Builder config(Optional<ListFilesConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public ListFilesParameters build() {
      return new AutoValue_ListFilesParameters(
          this.config);
    }
  }

}
