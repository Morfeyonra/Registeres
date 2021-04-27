package restservice.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.infosys.serviceBuilder.model.banks;
import com.infosys.serviceBuilder.model.staff_roster;
import com.infosys.serviceBuilder.service.banksLocalServiceUtil;
import com.infosys.serviceBuilder.service.staff_rosterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

/**
 * @author user
 */
@Component(
	property = {
		JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/greetings",
		JaxrsWhiteboardConstants.JAX_RS_NAME + "=Greetings.Rest",
		"auth.verifier.auth.verifier.PortalSessionAuthVerifier.check.csrf.token=false",
		"auth.verifier.guest.allowed=true",
		"liferay.access.control.disable=true"
	},
	service = Application.class
)
public class RestApplication extends Application {

	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getStuff")
	public Response getStuff() {

		ObjectMapper objectMapper = new ObjectMapper();

		List<staff_roster> stuff = staff_rosterLocalServiceUtil
				.getstaff_rosters(0, staff_rosterLocalServiceUtil.getstaff_rostersCount());

		List<StuffDTO> pogo = new ArrayList<>();

		for (staff_roster st : stuff) {
			pogo.add(new StuffDTO(st));
		}

		String stuffStr = null;

		try {
			stuffStr = objectMapper.writeValueAsString(pogo);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return Response.ok()
				.entity(stuffStr)
				.build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getWorker/{id}")
	public Response getWorker(@PathParam("id") int id) {

		ObjectMapper objectMapper = new ObjectMapper();
		staff_roster stuff;
		String stuffStr = null;

		try {
			stuff = staff_rosterLocalServiceUtil.getstaff_roster(id);
			stuffStr = objectMapper.writeValueAsString(new WorkerDTO(stuff));
		} catch (PortalException | JsonProcessingException e) {
			e.printStackTrace();
		}

		return Response.ok()
				.entity(stuffStr)
				.build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getBanks")
	public Response getBanks() {

		ObjectMapper objectMapper = new ObjectMapper();
		List<banks> bank = banksLocalServiceUtil.getbankses(0, banksLocalServiceUtil.getbanksesCount());

		List<BankDTO> pogo = new ArrayList<>();

		for (banks b : bank) {
			pogo.add(new BankDTO(b));
		}

		String bankStr = null;

		try {
			bankStr = objectMapper.writeValueAsString(pogo);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return Response.ok()
				.entity(bankStr)
				.build();
	}
}