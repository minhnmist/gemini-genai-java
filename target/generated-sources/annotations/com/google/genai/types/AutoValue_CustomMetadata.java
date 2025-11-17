package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CustomMetadata extends CustomMetadata {

  private final Optional<String> key;

  private final Optional<Float> numericValue;

  private final Optional<StringList> stringListValue;

  private final Optional<String> stringValue;

  private AutoValue_CustomMetadata(
      Optional<String> key,
      Optional<Float> numericValue,
      Optional<StringList> stringListValue,
      Optional<String> stringValue) {
    this.key = key;
    this.numericValue = numericValue;
    this.stringListValue = stringListValue;
    this.stringValue = stringValue;
  }

  @JsonProperty("key")
  @Override
  public Optional<String> key() {
    return key;
  }

  @JsonProperty("numericValue")
  @Override
  public Optional<Float> numericValue() {
    return numericValue;
  }

  @JsonProperty("stringListValue")
  @Override
  public Optional<StringList> stringListValue() {
    return stringListValue;
  }

  @JsonProperty("stringValue")
  @Override
  public Optional<String> stringValue() {
    return stringValue;
  }

  @Override
  public String toString() {
    return "CustomMetadata{"
        + "key=" + key + ", "
        + "numericValue=" + numericValue + ", "
        + "stringListValue=" + stringListValue + ", "
        + "stringValue=" + stringValue
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CustomMetadata) {
      CustomMetadata that = (CustomMetadata) o;
      return this.key.equals(that.key())
          && this.numericValue.equals(that.numericValue())
          && this.stringListValue.equals(that.stringListValue())
          && this.stringValue.equals(that.stringValue());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= key.hashCode();
    h$ *= 1000003;
    h$ ^= numericValue.hashCode();
    h$ *= 1000003;
    h$ ^= stringListValue.hashCode();
    h$ *= 1000003;
    h$ ^= stringValue.hashCode();
    return h$;
  }

  @Override
  public CustomMetadata.Builder toBuilder() {
    return new AutoValue_CustomMetadata.Builder(this);
  }

  static final class Builder extends CustomMetadata.Builder {
    private Optional<String> key = Optional.empty();
    private Optional<Float> numericValue = Optional.empty();
    private Optional<StringList> stringListValue = Optional.empty();
    private Optional<String> stringValue = Optional.empty();
    Builder() {
    }
    Builder(CustomMetadata source) {
      this.key = source.key();
      this.numericValue = source.numericValue();
      this.stringListValue = source.stringListValue();
      this.stringValue = source.stringValue();
    }
    @Override
    public CustomMetadata.Builder key(String key) {
      this.key = Optional.of(key);
      return this;
    }
    @Override
    CustomMetadata.Builder key(Optional<String> key) {
      if (key == null) {
        throw new NullPointerException("Null key");
      }
      this.key = key;
      return this;
    }
    @Override
    public CustomMetadata.Builder numericValue(Float numericValue) {
      this.numericValue = Optional.of(numericValue);
      return this;
    }
    @Override
    CustomMetadata.Builder numericValue(Optional<Float> numericValue) {
      if (numericValue == null) {
        throw new NullPointerException("Null numericValue");
      }
      this.numericValue = numericValue;
      return this;
    }
    @Override
    public CustomMetadata.Builder stringListValue(StringList stringListValue) {
      this.stringListValue = Optional.of(stringListValue);
      return this;
    }
    @Override
    CustomMetadata.Builder stringListValue(Optional<StringList> stringListValue) {
      if (stringListValue == null) {
        throw new NullPointerException("Null stringListValue");
      }
      this.stringListValue = stringListValue;
      return this;
    }
    @Override
    public CustomMetadata.Builder stringValue(String stringValue) {
      this.stringValue = Optional.of(stringValue);
      return this;
    }
    @Override
    CustomMetadata.Builder stringValue(Optional<String> stringValue) {
      if (stringValue == null) {
        throw new NullPointerException("Null stringValue");
      }
      this.stringValue = stringValue;
      return this;
    }
    @Override
    public CustomMetadata build() {
      return new AutoValue_CustomMetadata(
          this.key,
          this.numericValue,
          this.stringListValue,
          this.stringValue);
    }
  }

}
