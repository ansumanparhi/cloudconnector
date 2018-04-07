package com.idservice.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idservice.model.ConsumerResponse;
import com.idservice.model.IdModel;

@Service("idservice")
public class IdService {

	@Autowired
	private DataSource dataSource;

	ConsumerResponse consumerResponse = null;

	public String createContract(String consumerID) throws SQLException {
		Connection conn = dataSource.getConnection();

		try {
			CallableStatement cst = conn.prepareCall(
					"{CALL \"ID_GENERATION_SCHEMA\".\"com.arm.idGenerationService.Procedure::idDetailCreateID\"(?,?,?,?,?)}");

			cst.setString(1, consumerID);
			cst.setString(2, null);
			cst.setString(3, null);
			cst.registerOutParameter(1, java.sql.Types.NVARCHAR);
			cst.registerOutParameter(2, java.sql.Types.NVARCHAR);
			cst.execute();
			String returnedID = cst.getString(1);
			String Exceptionmsg = cst.getString(2);
			return returnedID;
			/*
			 * consumerResponse.setContractID(consumerID + "0000" + returnedID);
			 * consumerResponse.setMessage("success"); consumerResponse.setStatusCode(200);
			 * return consumerResponse;
			 */
		} finally {

			conn.close();
		}
	}

}