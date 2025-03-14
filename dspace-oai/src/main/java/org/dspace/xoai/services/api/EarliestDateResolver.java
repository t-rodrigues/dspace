/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.xoai.services.api;

import java.sql.SQLException;
import java.time.Instant;

import org.dspace.core.Context;
import org.dspace.xoai.exceptions.InvalidMetadataFieldException;

public interface EarliestDateResolver {
    public Instant getEarliestDate(Context context) throws InvalidMetadataFieldException, SQLException;
}
