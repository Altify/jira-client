package net.rcarz.jiraclient.agile

import net.sf.json.JSONSerializer
import org.hamcrest.core.IsEqual
import org.hamcrest.core.IsNot
import org.hamcrest.core.IsNull
import org.junit.Test

import static org.junit.Assert.assertThat
import static org.mockito.Mockito.when

/**
 *  Created on 2016-05-19.
 * @author pldupont
 */
class AgileClientTest extends AbstractResourceTest {

    @Test
    void "Given an agileClient, when calling getBoards(), then receive a list of Board."() {
        "given an Agile Client"()
        when(mockRestClient.get(AgileResource.RESOURCE_URI + "board"))
                .thenReturn(JSONSerializer.toJSON(JSONResources.LIST_OF_BOARDS))

        List<Board> boards = agileClient.getBoards();

        assertThat boards, new IsNot<>(new IsNull())
        assertThat boards.size(), new IsEqual<Integer>(2)
<<<<<<< Updated upstream
        "Assert equals to Board ${JSONResources.BOARD_ID}"(boards.get(0))
=======
        "Assert equals to Board"(boards.get(0))
>>>>>>> Stashed changes
    }

    @Test
    void "Given an agileClient, when calling getBoard(boardId), then receive one Board."() {
        "given an Agile Client"()
        when(mockRestClient.get(AgileResource.RESOURCE_URI + "board/" + JSONResources.BOARD_ID))
                .thenReturn(JSONSerializer.toJSON(JSONResources.BOARD))

        Board board = agileClient.getBoard(JSONResources.BOARD_ID);

        assertThat board, new IsNot<>(new IsNull())
<<<<<<< Updated upstream
        "Assert equals to Board ${JSONResources.BOARD_ID}"(board)
=======
        "Assert equals to Board"(board)
>>>>>>> Stashed changes
    }

    @Test
    void "Given an agileClient, when calling getSprint(sprintId), then receive one Sprint."() {
        "given an Agile Client"()
        when(mockRestClient.get(AgileResource.RESOURCE_URI + "sprint/" + JSONResources.SPRINT_ID))
                .thenReturn(JSONSerializer.toJSON(JSONResources.SPRINT))

        Sprint sprint = agileClient.getSprint(JSONResources.SPRINT_ID);

        assertThat sprint, new IsNot<>(new IsNull())
<<<<<<< Updated upstream
        "Assert equals to Sprint ${JSONResources.SPRINT_ID}"(sprint)
=======
        "Assert equals to Sprint"(sprint)
>>>>>>> Stashed changes
    }

    @Test
    void "Given an agileClient, when calling getIssue(id), then receive one Issue."() {
        "given an Agile Client"()
        when(mockRestClient.get(AgileResource.RESOURCE_URI + "issue/" + JSONResources.ISSUE_ID))
                .thenReturn(JSONSerializer.toJSON(JSONResources.ISSUE))

        Issue issue = agileClient.getIssue(JSONResources.ISSUE_ID);

<<<<<<< Updated upstream
        "Assert equals to Issue ${JSONResources.ISSUE_ID}"(issue)
=======
        "Assert equals to Issue"(issue)
>>>>>>> Stashed changes
    }

    @Test
    void "Given an agileClient, when calling getIssue(key), then receive one Issue."() {
        "given an Agile Client"()
        when(mockRestClient.get(AgileResource.RESOURCE_URI + "issue/" + JSONResources.ISSUE_KEY))
                .thenReturn(JSONSerializer.toJSON(JSONResources.ISSUE))

        Issue issue = agileClient.getIssue(JSONResources.ISSUE_KEY);

<<<<<<< Updated upstream
        "Assert equals to Issue ${JSONResources.ISSUE_KEY}"(issue)
=======
        "Assert equals to Issue"(issue)
>>>>>>> Stashed changes
    }

    @Test
    void "Given an agileClient, when calling getEpic(id), then receive one Epic."() {
        "given an Agile Client"()
        when(mockRestClient.get(AgileResource.RESOURCE_URI + "epic/" + JSONResources.EPIC_ID))
                .thenReturn(JSONSerializer.toJSON(JSONResources.EPIC))

        Epic epic = agileClient.getEpic(JSONResources.EPIC_ID);

<<<<<<< Updated upstream
        "Assert equals to Epic ${JSONResources.EPIC_ID}"(epic)
=======
        "Assert equals to Epic"(epic)
>>>>>>> Stashed changes
    }
}
