package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_StringList extends StringList {

  private final Optional<List<String>> values;

  private AutoValue_StringList(
      Optional<List<String>> values) {
    this.values = values;
  }

  @JsonProperty("values")
  @Override
  public Optional<List<String>> values() {
    return values;
  }

  @Override
  public String toString() {
    return "StringList{"
        + "values=" + values
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof StringList) {
      StringList that = (StringList) o;
      return this.values.equals(that.values());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= values.hashCode();
    return h$;
  }

  @Override
  public StringList.Builder toBuilder() {
    return new AutoValue_StringList.Builder(this);
  }

  static final class Builder extends StringList.Builder {
    private Optional<List<String>> values = Optional.empty();
    Builder() {
    }
    Builder(StringList source) {
      this.values = source.values();
    }
    @Override
    public StringList.Builder values(List<String> values) {
      this.values = Optional.of(values);
      return this;
    }
    @Override
    StringList.Builder values(Optional<List<String>> values) {
      if (values == null) {
        throw new NullPointerException("Null values");
      }
      this.values = values;
      return this;
    }
    @Override
    public StringList build() {
      return new AutoValue_StringList(
          this.values);
    }
  }

}
