public record Engagement(Long id, Long clientId, String name) {}

public record EngagementLetter(Long id, Long engagementId, Long engagementDocumentId) {}

public record EngagementDocument(Long id, Long engagementId, String documentType, boolean isSigned) {}

public record EngagementDocumentContact(Long id, Long engagementDocumentId, Long contactId, boolean isSigned) {}

public record BatchCreateResponse(/* TODO */)

public interface IEngagementRepository {
    Engagement persist(Engagement record);
}

public interface IEngagementLetterRepository {
    EngagementLetter persist(EngagementLetter record);
}

public interface IEngagementDocumentRepository {
    EngagementDocument persist(EngagementDocument record);
}

public interface IEngagementDocumentContactRepository {
    EngagementDocumentContact persist(EngagementDocumentContact record);
}

public class EngagementController {

    private final IEngagementRepository engagementRepository;
    private final IEngagementLetterRepository engagementLetterRepository;
    private final IEngagementDocumentRepository engagementDocumentRepository;
    private final IEngagementDocumentContactRepository engagementDocumentContactRepository;

    public EngagementService(IEngagementRepository engagementRepository, 
                             IEngagementLetterRepository engagementLetterRepository, 
                             IEngagementDocumentRepository engagementDocumentRepository, 
                             IEngagementDocumentContactRepository engagementDocumentContactRepository) {
        this.engagementRepository = engagementRepository;
        this.engagementLetterRepository = engagementLetterRepository;
        this.engagementDocumentRepository = engagementDocumentRepository;
        this.engagementDocumentContactRepository = engagementDocumentContactRepository;
    }

    public BatchCreateResponse batchCreate() {
      // solution here
    }
}
