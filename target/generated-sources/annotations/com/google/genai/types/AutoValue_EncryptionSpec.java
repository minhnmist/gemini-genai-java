package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_EncryptionSpec extends EncryptionSpec {

  private final Optional<String> kmsKeyName;

  private AutoValue_EncryptionSpec(
      Optional<String> kmsKeyName) {
    this.kmsKeyName = kmsKeyName;
  }

  @JsonProperty("kmsKeyName")
  @Override
  public Optional<String> kmsKeyName() {
    return kmsKeyName;
  }

  @Override
  public String toString() {
    return "EncryptionSpec{"
        + "kmsKeyName=" + kmsKeyName
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof EncryptionSpec) {
      EncryptionSpec that = (EncryptionSpec) o;
      return this.kmsKeyName.equals(that.kmsKeyName());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= kmsKeyName.hashCode();
    return h$;
  }

  @Override
  public EncryptionSpec.Builder toBuilder() {
    return new AutoValue_EncryptionSpec.Builder(this);
  }

  static final class Builder extends EncryptionSpec.Builder {
    private Optional<String> kmsKeyName = Optional.empty();
    Builder() {
    }
    Builder(EncryptionSpec source) {
      this.kmsKeyName = source.kmsKeyName();
    }
    @Override
    public EncryptionSpec.Builder kmsKeyName(String kmsKeyName) {
      this.kmsKeyName = Optional.of(kmsKeyName);
      return this;
    }
    @Override
    EncryptionSpec.Builder kmsKeyName(Optional<String> kmsKeyName) {
      if (kmsKeyName == null) {
        throw new NullPointerException("Null kmsKeyName");
      }
      this.kmsKeyName = kmsKeyName;
      return this;
    }
    @Override
    public EncryptionSpec build() {
      return new AutoValue_EncryptionSpec(
          this.kmsKeyName);
    }
  }

}
