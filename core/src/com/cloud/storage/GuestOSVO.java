// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
package com.cloud.storage;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.cloudstack.api.Identity;
import org.apache.cloudstack.api.InternalIdentity;

@Entity
@Table(name="guest_os")
public class GuestOSVO implements GuestOS {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    long id;

    @Column(name="category_id")
    private long categoryId;

    @Column(name="name")
    String name;

    @Column(name="display_name")
    String displayName;

    @Column(name="uuid")
    String uuid = UUID.randomUUID().toString();

    @Override
    public long getId() {
    	return id;
    }

    public long getCategoryId() {
    	return categoryId;
    }

    public void setCategoryId(long categoryId) {
    	this.categoryId = categoryId;
    }

    @Override
    public String getName() {
    	return name;
    }

    public void setName(String name) {
    	this.name = name;
    }

    @Override
    public String getDisplayName() {
    	return displayName;
    }

    public void setDisplayName(String displayName) {
    	this.displayName = displayName;
    }

    @Override
    public String getUuid() {
    	return this.uuid;
    }

    public void setUuid(String uuid) {
    	this.uuid = uuid;
    }
}
