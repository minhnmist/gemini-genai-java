package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_BatchJobDestination extends BatchJobDestination {

  private final Optional<String> format;

  private final Optional<String> gcsUri;

  private final Optional<String> bigqueryUri;

  private final Optional<String> fileName;

  private final Optional<List<InlinedResponse>> inlinedResponses;

  private final Optional<List<InlinedEmbedContentResponse>> inlinedEmbedContentResponses;

  private AutoValue_BatchJobDestination(
      Optional<String> format,
      Optional<String> gcsUri,
      Optional<String> bigqueryUri,
      Optional<String> fileName,
      Optional<List<InlinedResponse>> inlinedResponses,
      Optional<List<InlinedEmbedContentResponse>> inlinedEmbedContentResponses) {
    this.format = format;
    this.gcsUri = gcsUri;
    this.bigqueryUri = bigqueryUri;
    this.fileName = fileName;
    this.inlinedResponses = inlinedResponses;
    this.inlinedEmbedContentResponses = inlinedEmbedContentResponses;
  }

  @JsonProperty("format")
  @Override
  public Optional<String> format() {
    return format;
  }

  @JsonProperty("gcsUri")
  @Override
  public Optional<String> gcsUri() {
    return gcsUri;
  }

  @JsonProperty("bigqueryUri")
  @Override
  public Optional<String> bigqueryUri() {
    return bigqueryUri;
  }

  @JsonProperty("fileName")
  @Override
  public Optional<String> fileName() {
    return fileName;
  }

  @JsonProperty("inlinedResponses")
  @Override
  public Optional<List<InlinedResponse>> inlinedResponses() {
    return inlinedResponses;
  }

  @JsonProperty("inlinedEmbedContentResponses")
  @Override
  public Optional<List<InlinedEmbedContentResponse>> inlinedEmbedContentResponses() {
    return inlinedEmbedContentResponses;
  }

  @Override
  public String toString() {
    return "BatchJobDestination{"
        + "format=" + format + ", "
        + "gcsUri=" + gcsUri + ", "
        + "bigqueryUri=" + bigqueryUri + ", "
        + "fileName=" + fileName + ", "
        + "inlinedResponses=" + inlinedResponses + ", "
        + "inlinedEmbedContentResponses=" + inlinedEmbedContentResponses
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BatchJobDestination) {
      BatchJobDestination that = (BatchJobDestination) o;
      return this.format.equals(that.format())
          && this.gcsUri.equals(that.gcsUri())
          && this.bigqueryUri.equals(that.bigqueryUri())
          && this.fileName.equals(that.fileName())
          && this.inlinedResponses.equals(that.inlinedResponses())
          && this.inlinedEmbedContentResponses.equals(that.inlinedEmbedContentResponses());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= format.hashCode();
    h$ *= 1000003;
    h$ ^= gcsUri.hashCode();
    h$ *= 1000003;
    h$ ^= bigqueryUri.hashCode();
    h$ *= 1000003;
    h$ ^= fileName.hashCode();
    h$ *= 1000003;
    h$ ^= inlinedResponses.hashCode();
    h$ *= 1000003;
    h$ ^= inlinedEmbedContentResponses.hashCode();
    return h$;
  }

  @Override
  public BatchJobDestination.Builder toBuilder() {
    return new AutoValue_BatchJobDestination.Builder(this);
  }

  static final class Builder extends BatchJobDestination.Builder {
    private Optional<String> format = Optional.empty();
    private Optional<String> gcsUri = Optional.empty();
    private Optional<String> bigqueryUri = Optional.empty();
    private Optional<String> fileName = Optional.empty();
    private Optional<List<InlinedResponse>> inlinedResponses = Optional.empty();
    private Optional<List<InlinedEmbedContentResponse>> inlinedEmbedContentResponses = Optional.empty();
    Builder() {
    }
    Builder(BatchJobDestination source) {
      this.format = source.format();
      this.gcsUri = source.gcsUri();
      this.bigqueryUri = source.bigqueryUri();
      this.fileName = source.fileName();
      this.inlinedResponses = source.inlinedResponses();
      this.inlinedEmbedContentResponses = source.inlinedEmbedContentResponses();
    }
    @Override
    public BatchJobDestination.Builder format(String format) {
      this.format = Optional.of(format);
      return this;
    }
    @Override
    BatchJobDestination.Builder format(Optional<String> format) {
      if (format == null) {
        throw new NullPointerException("Null format");
      }
      this.format = format;
      return this;
    }
    @Override
    public BatchJobDestination.Builder gcsUri(String gcsUri) {
      this.gcsUri = Optional.of(gcsUri);
      return this;
    }
    @Override
    BatchJobDestination.Builder gcsUri(Optional<String> gcsUri) {
      if (gcsUri == null) {
        throw new NullPointerException("Null gcsUri");
      }
      this.gcsUri = gcsUri;
      return this;
    }
    @Override
    public BatchJobDestination.Builder bigqueryUri(String bigqueryUri) {
      this.bigqueryUri = Optional.of(bigqueryUri);
      return this;
    }
    @Override
    BatchJobDestination.Builder bigqueryUri(Optional<String> bigqueryUri) {
      if (bigqueryUri == null) {
        throw new NullPointerException("Null bigqueryUri");
      }
      this.bigqueryUri = bigqueryUri;
      return this;
    }
    @Override
    public BatchJobDestination.Builder fileName(String fileName) {
      this.fileName = Optional.of(fileName);
      return this;
    }
    @Override
    BatchJobDestination.Builder fileName(Optional<String> fileName) {
      if (fileName == null) {
        throw new NullPointerException("Null fileName");
      }
      this.fileName = fileName;
      return this;
    }
    @Override
    public BatchJobDestination.Builder inlinedResponses(List<InlinedResponse> inlinedResponses) {
      this.inlinedResponses = Optional.of(inlinedResponses);
      return this;
    }
    @Override
    BatchJobDestination.Builder inlinedResponses(Optional<List<InlinedResponse>> inlinedResponses) {
      if (inlinedResponses == null) {
        throw new NullPointerException("Null inlinedResponses");
      }
      this.inlinedResponses = inlinedResponses;
      return this;
    }
    @Override
    public BatchJobDestination.Builder inlinedEmbedContentResponses(List<InlinedEmbedContentResponse> inlinedEmbedContentResponses) {
      this.inlinedEmbedContentResponses = Optional.of(inlinedEmbedContentResponses);
      return this;
    }
    @Override
    BatchJobDestination.Builder inlinedEmbedContentResponses(Optional<List<InlinedEmbedContentResponse>> inlinedEmbedContentResponses) {
      if (inlinedEmbedContentResponses == null) {
        throw new NullPointerException("Null inlinedEmbedContentResponses");
      }
      this.inlinedEmbedContentResponses = inlinedEmbedContentResponses;
      return this;
    }
    @Override
    public BatchJobDestination build() {
      return new AutoValue_BatchJobDestination(
          this.format,
          this.gcsUri,
          this.bigqueryUri,
          this.fileName,
          this.inlinedResponses,
          this.inlinedEmbedContentResponses);
    }
  }

}
