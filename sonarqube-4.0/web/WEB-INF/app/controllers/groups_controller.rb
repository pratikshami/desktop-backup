#
# Sonar, entreprise quality control tool.
# Copyright (C) 2008-2013 SonarSource
# mailto:contact AT sonarsource DOT com
#
# SonarQube is free software; you can redistribute it and/or
# modify it under the terms of the GNU Lesser General Public
# License as published by the Free Software Foundation; either
# version 3 of the License, or (at your option) any later version.
#
# SonarQube is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
# Lesser General Public License for more details.
#
# You should have received a copy of the GNU Lesser General Public License
# along with this program; if not, write to the Free Software Foundation,
# Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
#
class GroupsController < ApplicationController

  SECTION=Navigation::SECTION_CONFIGURATION
  before_filter :admin_required

  def index
    @groups = Group.find(:all, :order => 'name')
    if params[:id]
      @group = Group.find(params[:id])
    else
      @group = Group.new
    end
  end

  def create_form
    @group = Group.new
    render :partial => 'groups/create_form'
  end

  def edit_form
    require_parameters :id
    @group = Group.find(params[:id])
    render :partial => 'groups/edit_form'
  end

  def create
    verify_post_request
    group = Group.new(params[:group])
    if group.save
      flash[:notice] = 'The new group is created.'
      render :text => 'ok', :status => 200
    else
      @group = group
      @errors = []
      group.errors.full_messages.each{|msg| @errors<<msg}
      render :partial => 'groups/create_form', :status => 400
    end
  end

  def update
    verify_post_request
    require_parameters :id

    @group = Group.find(params[:id])
    if @group.update_attributes(params[:group])
      flash[:notice] = 'Group is updated.'
      render :text => 'ok', :status => 200
    else
      @errors = []
      @group.errors.full_messages.each{|msg| @errors<<msg}
      render :partial => 'groups/edit_form', :status => 400
    end
  end

  def delete
    verify_post_request
    require_parameters :id
    group = Group.find(params[:id])
    if group.destroy
      flash[:notice] = 'Group is deleted.'
    end
    to_index(group.errors, nil)
  end

  def select_user
    @group = Group.find(params[:id])
  end
  
  def set_users
    @group = Group.find(params[:id])
    if  @group.set_users(params[:users])
      flash[:notice] = 'Group is updated.'
    end
  
    redirect_to(:action => 'index')
  end


  private

  def to_index(errors, id)
    flash[:error] = errors.full_messages.join("<br/>\n") unless errors.empty?
    redirect_to(:action => 'index', :id => id)
  end

end
