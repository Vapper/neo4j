/*
 * Copyright (c) 2002-2018 "Neo4j,"
 * Neo4j Sweden AB [http://neo4j.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.index.impl.lucene.explicit;

import org.apache.lucene.index.CompositeReader;
import org.apache.lucene.index.Fields;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.StoredFieldVisitor;
import org.apache.lucene.index.Term;

import java.util.List;

public class CloseTrackingIndexReader extends CompositeReader
{

    private boolean closed;

    @Override
    protected List<? extends IndexReader> getSequentialSubReaders()
    {
        return null;
    }

    @Override
    public Fields getTermVectors( int docID )
    {
        return null;
    }

    @Override
    public int numDocs()
    {
        return 0;
    }

    @Override
    public int maxDoc()
    {
        return 0;
    }

    @Override
    public void document( int docID, StoredFieldVisitor visitor )
    {

    }

    @Override
    protected void doClose()
    {
        closed = true;
    }

    @Override
    public int docFreq( Term term )
    {
        return 0;
    }

    @Override
    public long totalTermFreq( Term term )
    {
        return 0;
    }

    @Override
    public long getSumDocFreq( String field )
    {
        return 0;
    }

    @Override
    public int getDocCount( String field )
    {
        return 0;
    }

    @Override
    public long getSumTotalTermFreq( String field )
    {
        return 0;
    }

    public boolean isClosed()
    {
        return closed;
    }
}
