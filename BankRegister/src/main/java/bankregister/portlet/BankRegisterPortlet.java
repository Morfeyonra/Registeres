package bankregister.portlet;

import bankregister.constants.BankRegisterPortletKeys;

import com.infosys.serviceBuilder.model.banks;
import com.infosys.serviceBuilder.service.banksLocalServiceUtil;
import com.infosys.serviceBuilder.service.persistence.banksPK;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import com.liferay.portal.kernel.util.ParamUtil;
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
		"javax.portlet.display-name=BankRegister",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + BankRegisterPortletKeys.BANKREGISTER,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class BankRegisterPortlet extends MVCPortlet {

	public void deleteBank(ActionRequest actionRequest, ActionResponse actionResponse) {

		String backURL = ParamUtil.getString(actionRequest, "backURL");

		banksPK pk = new banksPK(
				ParamUtil.getString(actionRequest, "del_bank_name"),
				ParamUtil.getString(actionRequest, "del_BIK"));

		try {
			banksLocalServiceUtil.deletebanks(pk);
			actionResponse.sendRedirect(backURL);
		} catch (PortalException | IOException e) {
			e.printStackTrace();
		}
	}

	public void submitChanges(ActionRequest actionRequest, ActionResponse actionResponse) {

		String backURL = ParamUtil.getString(actionRequest, "backURL");

		banksPK pk = new banksPK(
				ParamUtil.getString(actionRequest, "bank_name"),
				ParamUtil.getString(actionRequest, "oldBIK"));

		banksPK pk2 = new banksPK(
				ParamUtil.getString(actionRequest, "bank_name"),
				ParamUtil.getString(actionRequest, "bik"));

		try {
			banksLocalServiceUtil.deletebanks(pk);
		} catch (PortalException e) {
			e.printStackTrace();
		}

		banks newB = banksLocalServiceUtil.createbanks(pk2);

		newB.setAddress(ParamUtil.getString(actionRequest, "address"));
		newB.persist();

		try {
			actionResponse.sendRedirect(backURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addBank(ActionRequest actionRequest, ActionResponse actionResponse) {

		String backURL = ParamUtil.getString(actionRequest, "backURL");

		banksPK pk = new banksPK(
				ParamUtil.getString(actionRequest, "bank_name"),
				ParamUtil.getString(actionRequest, "bik"));

		banks newB = banksLocalServiceUtil.createbanks(pk);

		newB.setAddress(ParamUtil.getString(actionRequest, "address"));
		newB.persist();

		try {
			actionResponse.sendRedirect(backURL);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}