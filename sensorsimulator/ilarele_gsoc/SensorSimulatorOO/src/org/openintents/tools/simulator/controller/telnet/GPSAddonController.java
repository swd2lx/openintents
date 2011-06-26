package org.openintents.tools.simulator.controller.telnet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.openintents.tools.simulator.model.telnet.addons.GPSAddonModel;
import org.openintents.tools.simulator.view.telnet.addons.GPSAddonView;

public class GPSAddonController {
	// GPS variables
	@SuppressWarnings("unused")
	private GPSAddonView view;
	@SuppressWarnings("unused")
	private GPSAddonModel model;

	public GPSAddonController(final GPSAddonModel model, final GPSAddonView view) {
		this.model = model;
		this.view = view;

		JButton gpsButton = view.getGpsButton();
		gpsButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.sendGPS(view.getLongitude(), view.getLatitude(),
						view.getAltitude());
			}
		});
	}
}
