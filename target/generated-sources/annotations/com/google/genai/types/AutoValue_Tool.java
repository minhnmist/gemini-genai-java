package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Tool extends Tool {

  private final Optional<List<FunctionDeclaration>> functionDeclarations;

  private final Optional<Retrieval> retrieval;

  private final Optional<GoogleSearchRetrieval> googleSearchRetrieval;

  private final Optional<List<Method>> functions;

  private final Optional<ComputerUse> computerUse;

  private final Optional<FileSearch> fileSearch;

  private final Optional<ToolCodeExecution> codeExecution;

  private final Optional<EnterpriseWebSearch> enterpriseWebSearch;

  private final Optional<GoogleMaps> googleMaps;

  private final Optional<GoogleSearch> googleSearch;

  private final Optional<UrlContext> urlContext;

  private AutoValue_Tool(
      Optional<List<FunctionDeclaration>> functionDeclarations,
      Optional<Retrieval> retrieval,
      Optional<GoogleSearchRetrieval> googleSearchRetrieval,
      Optional<List<Method>> functions,
      Optional<ComputerUse> computerUse,
      Optional<FileSearch> fileSearch,
      Optional<ToolCodeExecution> codeExecution,
      Optional<EnterpriseWebSearch> enterpriseWebSearch,
      Optional<GoogleMaps> googleMaps,
      Optional<GoogleSearch> googleSearch,
      Optional<UrlContext> urlContext) {
    this.functionDeclarations = functionDeclarations;
    this.retrieval = retrieval;
    this.googleSearchRetrieval = googleSearchRetrieval;
    this.functions = functions;
    this.computerUse = computerUse;
    this.fileSearch = fileSearch;
    this.codeExecution = codeExecution;
    this.enterpriseWebSearch = enterpriseWebSearch;
    this.googleMaps = googleMaps;
    this.googleSearch = googleSearch;
    this.urlContext = urlContext;
  }

  @JsonProperty("functionDeclarations")
  @Override
  public Optional<List<FunctionDeclaration>> functionDeclarations() {
    return functionDeclarations;
  }

  @JsonProperty("retrieval")
  @Override
  public Optional<Retrieval> retrieval() {
    return retrieval;
  }

  @JsonProperty("googleSearchRetrieval")
  @Override
  public Optional<GoogleSearchRetrieval> googleSearchRetrieval() {
    return googleSearchRetrieval;
  }

  @JsonIgnore
  @Override
  public Optional<List<Method>> functions() {
    return functions;
  }

  @JsonProperty("computerUse")
  @Override
  public Optional<ComputerUse> computerUse() {
    return computerUse;
  }

  @JsonProperty("fileSearch")
  @Override
  public Optional<FileSearch> fileSearch() {
    return fileSearch;
  }

  @JsonProperty("codeExecution")
  @Override
  public Optional<ToolCodeExecution> codeExecution() {
    return codeExecution;
  }

  @JsonProperty("enterpriseWebSearch")
  @Override
  public Optional<EnterpriseWebSearch> enterpriseWebSearch() {
    return enterpriseWebSearch;
  }

  @JsonProperty("googleMaps")
  @Override
  public Optional<GoogleMaps> googleMaps() {
    return googleMaps;
  }

  @JsonProperty("googleSearch")
  @Override
  public Optional<GoogleSearch> googleSearch() {
    return googleSearch;
  }

  @JsonProperty("urlContext")
  @Override
  public Optional<UrlContext> urlContext() {
    return urlContext;
  }

  @Override
  public String toString() {
    return "Tool{"
        + "functionDeclarations=" + functionDeclarations + ", "
        + "retrieval=" + retrieval + ", "
        + "googleSearchRetrieval=" + googleSearchRetrieval + ", "
        + "functions=" + functions + ", "
        + "computerUse=" + computerUse + ", "
        + "fileSearch=" + fileSearch + ", "
        + "codeExecution=" + codeExecution + ", "
        + "enterpriseWebSearch=" + enterpriseWebSearch + ", "
        + "googleMaps=" + googleMaps + ", "
        + "googleSearch=" + googleSearch + ", "
        + "urlContext=" + urlContext
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Tool) {
      Tool that = (Tool) o;
      return this.functionDeclarations.equals(that.functionDeclarations())
          && this.retrieval.equals(that.retrieval())
          && this.googleSearchRetrieval.equals(that.googleSearchRetrieval())
          && this.functions.equals(that.functions())
          && this.computerUse.equals(that.computerUse())
          && this.fileSearch.equals(that.fileSearch())
          && this.codeExecution.equals(that.codeExecution())
          && this.enterpriseWebSearch.equals(that.enterpriseWebSearch())
          && this.googleMaps.equals(that.googleMaps())
          && this.googleSearch.equals(that.googleSearch())
          && this.urlContext.equals(that.urlContext());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= functionDeclarations.hashCode();
    h$ *= 1000003;
    h$ ^= retrieval.hashCode();
    h$ *= 1000003;
    h$ ^= googleSearchRetrieval.hashCode();
    h$ *= 1000003;
    h$ ^= functions.hashCode();
    h$ *= 1000003;
    h$ ^= computerUse.hashCode();
    h$ *= 1000003;
    h$ ^= fileSearch.hashCode();
    h$ *= 1000003;
    h$ ^= codeExecution.hashCode();
    h$ *= 1000003;
    h$ ^= enterpriseWebSearch.hashCode();
    h$ *= 1000003;
    h$ ^= googleMaps.hashCode();
    h$ *= 1000003;
    h$ ^= googleSearch.hashCode();
    h$ *= 1000003;
    h$ ^= urlContext.hashCode();
    return h$;
  }

  @Override
  public Tool.Builder toBuilder() {
    return new AutoValue_Tool.Builder(this);
  }

  static final class Builder extends Tool.Builder {
    private Optional<List<FunctionDeclaration>> functionDeclarations = Optional.empty();
    private Optional<Retrieval> retrieval = Optional.empty();
    private Optional<GoogleSearchRetrieval> googleSearchRetrieval = Optional.empty();
    private Optional<List<Method>> functions = Optional.empty();
    private Optional<ComputerUse> computerUse = Optional.empty();
    private Optional<FileSearch> fileSearch = Optional.empty();
    private Optional<ToolCodeExecution> codeExecution = Optional.empty();
    private Optional<EnterpriseWebSearch> enterpriseWebSearch = Optional.empty();
    private Optional<GoogleMaps> googleMaps = Optional.empty();
    private Optional<GoogleSearch> googleSearch = Optional.empty();
    private Optional<UrlContext> urlContext = Optional.empty();
    Builder() {
    }
    Builder(Tool source) {
      this.functionDeclarations = source.functionDeclarations();
      this.retrieval = source.retrieval();
      this.googleSearchRetrieval = source.googleSearchRetrieval();
      this.functions = source.functions();
      this.computerUse = source.computerUse();
      this.fileSearch = source.fileSearch();
      this.codeExecution = source.codeExecution();
      this.enterpriseWebSearch = source.enterpriseWebSearch();
      this.googleMaps = source.googleMaps();
      this.googleSearch = source.googleSearch();
      this.urlContext = source.urlContext();
    }
    @Override
    public Tool.Builder functionDeclarations(List<FunctionDeclaration> functionDeclarations) {
      this.functionDeclarations = Optional.of(functionDeclarations);
      return this;
    }
    @Override
    Tool.Builder functionDeclarations(Optional<List<FunctionDeclaration>> functionDeclarations) {
      if (functionDeclarations == null) {
        throw new NullPointerException("Null functionDeclarations");
      }
      this.functionDeclarations = functionDeclarations;
      return this;
    }
    @Override
    public Tool.Builder retrieval(Retrieval retrieval) {
      this.retrieval = Optional.of(retrieval);
      return this;
    }
    @Override
    Tool.Builder retrieval(Optional<Retrieval> retrieval) {
      if (retrieval == null) {
        throw new NullPointerException("Null retrieval");
      }
      this.retrieval = retrieval;
      return this;
    }
    @Override
    public Tool.Builder googleSearchRetrieval(GoogleSearchRetrieval googleSearchRetrieval) {
      this.googleSearchRetrieval = Optional.of(googleSearchRetrieval);
      return this;
    }
    @Override
    Tool.Builder googleSearchRetrieval(Optional<GoogleSearchRetrieval> googleSearchRetrieval) {
      if (googleSearchRetrieval == null) {
        throw new NullPointerException("Null googleSearchRetrieval");
      }
      this.googleSearchRetrieval = googleSearchRetrieval;
      return this;
    }
    @Override
    public Tool.Builder functions(List<Method> functions) {
      this.functions = Optional.of(functions);
      return this;
    }
    @Override
    Tool.Builder functions(Optional<List<Method>> functions) {
      if (functions == null) {
        throw new NullPointerException("Null functions");
      }
      this.functions = functions;
      return this;
    }
    @Override
    public Tool.Builder computerUse(ComputerUse computerUse) {
      this.computerUse = Optional.of(computerUse);
      return this;
    }
    @Override
    Tool.Builder computerUse(Optional<ComputerUse> computerUse) {
      if (computerUse == null) {
        throw new NullPointerException("Null computerUse");
      }
      this.computerUse = computerUse;
      return this;
    }
    @Override
    public Tool.Builder fileSearch(FileSearch fileSearch) {
      this.fileSearch = Optional.of(fileSearch);
      return this;
    }
    @Override
    Tool.Builder fileSearch(Optional<FileSearch> fileSearch) {
      if (fileSearch == null) {
        throw new NullPointerException("Null fileSearch");
      }
      this.fileSearch = fileSearch;
      return this;
    }
    @Override
    public Tool.Builder codeExecution(ToolCodeExecution codeExecution) {
      this.codeExecution = Optional.of(codeExecution);
      return this;
    }
    @Override
    Tool.Builder codeExecution(Optional<ToolCodeExecution> codeExecution) {
      if (codeExecution == null) {
        throw new NullPointerException("Null codeExecution");
      }
      this.codeExecution = codeExecution;
      return this;
    }
    @Override
    public Tool.Builder enterpriseWebSearch(EnterpriseWebSearch enterpriseWebSearch) {
      this.enterpriseWebSearch = Optional.of(enterpriseWebSearch);
      return this;
    }
    @Override
    Tool.Builder enterpriseWebSearch(Optional<EnterpriseWebSearch> enterpriseWebSearch) {
      if (enterpriseWebSearch == null) {
        throw new NullPointerException("Null enterpriseWebSearch");
      }
      this.enterpriseWebSearch = enterpriseWebSearch;
      return this;
    }
    @Override
    public Tool.Builder googleMaps(GoogleMaps googleMaps) {
      this.googleMaps = Optional.of(googleMaps);
      return this;
    }
    @Override
    Tool.Builder googleMaps(Optional<GoogleMaps> googleMaps) {
      if (googleMaps == null) {
        throw new NullPointerException("Null googleMaps");
      }
      this.googleMaps = googleMaps;
      return this;
    }
    @Override
    public Tool.Builder googleSearch(GoogleSearch googleSearch) {
      this.googleSearch = Optional.of(googleSearch);
      return this;
    }
    @Override
    Tool.Builder googleSearch(Optional<GoogleSearch> googleSearch) {
      if (googleSearch == null) {
        throw new NullPointerException("Null googleSearch");
      }
      this.googleSearch = googleSearch;
      return this;
    }
    @Override
    public Tool.Builder urlContext(UrlContext urlContext) {
      this.urlContext = Optional.of(urlContext);
      return this;
    }
    @Override
    Tool.Builder urlContext(Optional<UrlContext> urlContext) {
      if (urlContext == null) {
        throw new NullPointerException("Null urlContext");
      }
      this.urlContext = urlContext;
      return this;
    }
    @Override
    public Tool build() {
      return new AutoValue_Tool(
          this.functionDeclarations,
          this.retrieval,
          this.googleSearchRetrieval,
          this.functions,
          this.computerUse,
          this.fileSearch,
          this.codeExecution,
          this.enterpriseWebSearch,
          this.googleMaps,
          this.googleSearch,
          this.urlContext);
    }
  }

}
