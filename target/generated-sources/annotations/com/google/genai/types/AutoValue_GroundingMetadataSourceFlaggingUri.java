package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GroundingMetadataSourceFlaggingUri extends GroundingMetadataSourceFlaggingUri {

  private final Optional<String> flagContentUri;

  private final Optional<String> sourceId;

  private AutoValue_GroundingMetadataSourceFlaggingUri(
      Optional<String> flagContentUri,
      Optional<String> sourceId) {
    this.flagContentUri = flagContentUri;
    this.sourceId = sourceId;
  }

  @JsonProperty("flagContentUri")
  @Override
  public Optional<String> flagContentUri() {
    return flagContentUri;
  }

  @JsonProperty("sourceId")
  @Override
  public Optional<String> sourceId() {
    return sourceId;
  }

  @Override
  public String toString() {
    return "GroundingMetadataSourceFlaggingUri{"
        + "flagContentUri=" + flagContentUri + ", "
        + "sourceId=" + sourceId
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GroundingMetadataSourceFlaggingUri) {
      GroundingMetadataSourceFlaggingUri that = (GroundingMetadataSourceFlaggingUri) o;
      return this.flagContentUri.equals(that.flagContentUri())
          && this.sourceId.equals(that.sourceId());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= flagContentUri.hashCode();
    h$ *= 1000003;
    h$ ^= sourceId.hashCode();
    return h$;
  }

  @Override
  public GroundingMetadataSourceFlaggingUri.Builder toBuilder() {
    return new AutoValue_GroundingMetadataSourceFlaggingUri.Builder(this);
  }

  static final class Builder extends GroundingMetadataSourceFlaggingUri.Builder {
    private Optional<String> flagContentUri = Optional.empty();
    private Optional<String> sourceId = Optional.empty();
    Builder() {
    }
    Builder(GroundingMetadataSourceFlaggingUri source) {
      this.flagContentUri = source.flagContentUri();
      this.sourceId = source.sourceId();
    }
    @Override
    public GroundingMetadataSourceFlaggingUri.Builder flagContentUri(String flagContentUri) {
      this.flagContentUri = Optional.of(flagContentUri);
      return this;
    }
    @Override
    GroundingMetadataSourceFlaggingUri.Builder flagContentUri(Optional<String> flagContentUri) {
      if (flagContentUri == null) {
        throw new NullPointerException("Null flagContentUri");
      }
      this.flagContentUri = flagContentUri;
      return this;
    }
    @Override
    public GroundingMetadataSourceFlaggingUri.Builder sourceId(String sourceId) {
      this.sourceId = Optional.of(sourceId);
      return this;
    }
    @Override
    GroundingMetadataSourceFlaggingUri.Builder sourceId(Optional<String> sourceId) {
      if (sourceId == null) {
        throw new NullPointerException("Null sourceId");
      }
      this.sourceId = sourceId;
      return this;
    }
    @Override
    public GroundingMetadataSourceFlaggingUri build() {
      return new AutoValue_GroundingMetadataSourceFlaggingUri(
          this.flagContentUri,
          this.sourceId);
    }
  }

}
