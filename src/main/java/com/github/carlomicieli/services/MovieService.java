/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.carlomicieli.services;

import java.util.List;

import org.bson.types.ObjectId;
import com.github.carlomicieli.models.Movie;
import com.github.carlomicieli.utility.PaginatedResult;

/**
 * 
 * @author Carlo P. Micieli
 *
 */
public interface MovieService {
	PaginatedResult<Movie> getAllMovies(int page, int pageSize);
	Movie findById(ObjectId id);
	Movie findBySlug(String slug);
	void save(Movie movie);
	void delete(Movie movie);
	List<Movie> getRecentMovies(int numOfMovies);
}