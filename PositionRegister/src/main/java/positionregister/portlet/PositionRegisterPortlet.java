package positionregister.portlet;

import com.infosys.serviceBuilder.model.job_register;
import com.infosys.serviceBuilder.service.job_registerLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.ParamUtil;
import positionregister.constants.PositionRegisterPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import java.io.IOException;

/**
 * @author user
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=PositionRegister",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PositionRegisterPortletKeys.POSITIONREGISTER,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PositionRegisterPortlet extends MVCPortlet {

	public void submitChanges(ActionRequest actionRequest, ActionResponse actionResponse) {

		String backURL = ParamUtil.getString(actionRequest, "backURL");

		try {
			job_registerLocalServiceUtil.deletejob_register(ParamUtil.getString(actionRequest, "oldPosition"));
		} catch (PortalException e) {
			e.printStackTrace();
		}

		job_register newJR = job_registerLocalServiceUtil.createjob_register(
				ParamUtil.getString(actionRequest, "position"));

		newJR.setArchive(ParamUtil.getBoolean(actionRequest, "archive"));
		newJR.persist();

		try {
			actionResponse.sendRedirect(backURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void deleteJob(ActionRequest actionRequest, ActionResponse actionResponse) {

		String backURL = ParamUtil.getString(actionRequest, "backURL");

		try {
			job_registerLocalServiceUtil.deletejob_register(ParamUtil.getString(actionRequest, "position"));
			actionResponse.sendRedirect(backURL);
		} catch (IOException | PortalException e) {
			e.printStackTrace();
		}
	}

	public void addJob(ActionRequest actionRequest, ActionResponse actionResponse) {

		String backURL = ParamUtil.getString(actionRequest, "backURL");

		job_register newJR = job_registerLocalServiceUtil.createjob_register(
				ParamUtil.getString(actionRequest, "position"));

		newJR.setArchive(ParamUtil.getBoolean(actionRequest, "archive"));
		newJR.persist();

		try {
			actionResponse.sendRedirect(backURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void changeArchStat(ActionRequest actionRequest, ActionResponse actionResponse) {

		String backURL = ParamUtil.getString(actionRequest, "backURL");

		try {
			job_register jr = job_registerLocalServiceUtil.getjob_register(
					ParamUtil.getString(actionRequest, "position"));

			jr.setArchive(!jr.getArchive());
			jr.persist();

			actionResponse.sendRedirect(backURL);
		} catch (PortalException | IOException e) {
			e.printStackTrace();
		}
	}
}