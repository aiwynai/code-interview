data class Engagement(val id: Long, val clientId: Long, val name: String)

data class EngagementLetter(val id: Long, val engagementId: Long, val engagementDocumentId: Long)

data class EngagementDocument(val id: Long, val engagementId: Long, val documentType: String, val isSigned: Boolean)

data class EngagementDocumentContact(val id: Long, val engagementDocumentId: Long, val contactId: Long, val isSigned: Boolean)

interface IRepository<M> {
    fun persist(record: M): M
}
interface IEngagementRepository : IRepository<Engagement>
interface IEngagementLetterRepository : IRepository<EngagementLetter>
interface IEngagementDocumentRepository : IRepository<EngagementDocument>
interface IEngagementDocumentContactRepository : IRepository<EngagementDocumentContact>

class EngagementController(
    private val engagementRepository: IEngagementRepository,
    private val engagementLetterRepository: IEngagementLetterRepository,
    private val engagementDocumentRepository: IEngagementDocumentRepository,
    private val engagementDocumentContactRepository: IEngagementDocumentContactRepository,
) {

    fun createEngagement(/* @RequestBody */ engagement: Engagement): Long {
        return engagementRepository.persist(engagement).id
    }

    fun createEngagementLetter(/* @RequestBody */ engagementLetter: EngagementLetter): Long {
        return engagementLetterRepository.persist(engagementLetter).id
    }

    fun createEngagements(/* TODO: define request payload */): Nothing /* TODO define response */ {
        // solution here
        TODO()
    }
}
