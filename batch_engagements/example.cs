using System;

public record Engagement(long id, long clientId, string name);
public record EngagementLetter(long id, long engagementId, long engagementDocumentId);
public record EngagementDocument(long id, long engagementId, string documentType, bool isSigned);
public record EngagementDocumentContact(long id, long engagementDocumentId, long contactId, bool isSigned);
public record BatchCreateResponse();

public interface IEngagementRepository
{
    Engagement persist(Engagement record);
}

public interface IEngagementLetterRepository
{
    EngagementLetter persist(EngagementLetter record);
}

public interface IEngagementDocumentRepository
{
    EngagementDocument persist(EngagementDocument record);
}

public interface IEngagementDocumentContactRepository
{
    EngagementDocumentContact persist(EngagementDocumentContact record);
}

public class EngagementController
{
    private readonly IEngagementRepository engagementRepository;
    private readonly IEngagementLetterRepository engagementLetterRepository;
    private readonly IEngagementDocumentRepository engagementDocumentRepository;
    private readonly IEngagementDocumentContactRepository engagementDocumentContactRepository;

    public EngagementController(IEngagementRepository engagementRepository,
                                IEngagementLetterRepository engagementLetterRepository,
                                IEngagementDocumentRepository engagementDocumentRepository,
                                IEngagementDocumentContactRepository engagementDocumentContactRepository)
    {
        this.engagementRepository = engagementRepository;
        this.engagementLetterRepository = engagementLetterRepository;
        this.engagementDocumentRepository = engagementDocumentRepository;
        this.engagementDocumentContactRepository = engagementDocumentContactRepository;
    }

    public BatchCreateResponse BatchCreate()
    {
      // solution here
    }
}

