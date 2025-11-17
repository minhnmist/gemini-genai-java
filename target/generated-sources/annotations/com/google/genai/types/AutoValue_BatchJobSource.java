package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_BatchJobSource extends BatchJobSource {

  private final Optional<String> format;

  private final Optional<List<String>> gcsUri;

  private final Optional<String> bigqueryUri;

  private final Optional<String> fileName;

  private final Optional<List<InlinedRequest>> inlinedRequests;

  private AutoValue_BatchJobSource(
      Optional<String> format,
      Optional<List<String>> gcsUri,
      Optional<String> bigqueryUri,
      Optional<String> fileName,
      Optional<List<InlinedRequest>> inlinedRequests) {
    this.format = format;
    this.gcsUri = gcsUri;
    this.bigqueryUri = bigqueryUri;
    this.fileName = fileName;
    this.inlinedRequests = inlinedRequests;
  }

  @JsonProperty("format")
  @Override
  public Optional<String> format() {
    return format;
  }

  @JsonProperty("gcsUri")
  @Override
  public Optional<List<String>> gcsUri() {
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

  @JsonProperty("inlinedRequests")
  @Override
  public Optional<List<InlinedRequest>> inlinedRequests() {
    return inlinedRequests;
  }

  @Override
  public String toString() {
    return "BatchJobSource{"
        + "format=" + format + ", "
        + "gcsUri=" + gcsUri + ", "
        + "bigqueryUri=" + bigqueryUri + ", "
        + "fileName=" + fileName + ", "
        + "inlinedRequests=" + inlinedRequests
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BatchJobSource) {
      BatchJobSource that = (BatchJobSource) o;
      return this.format.equals(that.format())
          && this.gcsUri.equals(that.gcsUri())
          && this.bigqueryUri.equals(that.bigqueryUri())
          && this.fileName.equals(that.fileName())
          && this.inlinedRequests.equals(that.inlinedRequests());
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
    h$ ^= inlinedRequests.hashCode();
    return h$;
  }

  @Override
  public BatchJobSource.Builder toBuilder() {
    return new AutoValue_BatchJobSource.Builder(this);
  }

  static final class Builder extends BatchJobSource.Builder {
    private Optional<String> format = Optional.empty();
    private Optional<List<String>> gcsUri = Optional.empty();
    private Optional<String> bigqueryUri = Optional.empty();
    private Optional<String> fileName = Optional.empty();
    private Optional<List<InlinedRequest>> inlinedRequests = Optional.empty();
    Builder() {
    }
    Builder(BatchJobSource source) {
      this.format = source.format();
      this.gcsUri = source.gcsUri();
      this.bigqueryUri = source.bigqueryUri();
      this.fileName = source.fileName();
      this.inlinedRequests = source.inlinedRequests();
    }
    @Override
    public BatchJobSource.Builder format(String format) {
      this.format = Optional.of(format);
      return this;
    }
    @Override
    BatchJobSource.Builder format(Optional<String> format) {
      if (format == null) {
        throw new NullPointerException("Null format");
      }
      this.format = format;
      return this;
    }
    @Override
    public BatchJobSource.Builder gcsUri(List<String> gcsUri) {
      this.gcsUri = Optional.of(gcsUri);
      return this;
    }
    @Override
    BatchJobSource.Builder gcsUri(Optional<List<String>> gcsUri) {
      if (gcsUri == null) {
        throw new NullPointerException("Null gcsUri");
      }
      this.gcsUri = gcsUri;
      return this;
    }
    @Override
    public BatchJobSource.Builder bigqueryUri(String bigqueryUri) {
      this.bigqueryUri = Optional.of(bigqueryUri);
      return this;
    }
    @Override
    BatchJobSource.Builder bigqueryUri(Optional<String> bigqueryUri) {
      if (bigqueryUri == null) {
        throw new NullPointerException("Null bigqueryUri");
      }
      this.bigqueryUri = bigqueryUri;
      return this;
    }
    @Override
    public BatchJobSource.Builder fileName(String fileName) {
      this.fileName = Optional.of(fileName);
      return this;
    }
    @Override
    BatchJobSource.Builder fileName(Optional<String> fileName) {
      if (fileName == null) {
        throw new NullPointerException("Null fileName");
      }
      this.fileName = fileName;
      return this;
    }
    @Override
    public BatchJobSource.Builder inlinedRequests(List<InlinedRequest> inlinedRequests) {
      this.inlinedRequests = Optional.of(inlinedRequests);
      return this;
    }
    @Override
    BatchJobSource.Builder inlinedRequests(Optional<List<InlinedRequest>> inlinedRequests) {
      if (inlinedRequests == null) {
        throw new NullPointerException("Null inlinedRequests");
      }
      this.inlinedRequests = inlinedRequests;
      return this;
    }
    @Override
    public BatchJobSource build() {
      return new AutoValue_BatchJobSource(
          this.format,
          this.gcsUri,
          this.bigqueryUri,
          this.fileName,
          this.inlinedRequests);
    }
  }

}
